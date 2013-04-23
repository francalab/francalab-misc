//
// (C) 2013 GENIVI Alliance
// All Rights Reserved
// (open source licensing not specified at this time)
//
// From 2013-04-23
// https://collab.genivi.org/wiki/display/genivi/Web+API+for+Vehicle+Data#WebAPIforVehicleData-6.FullWebIDL
	
module vehicle {
    typedef DOMString VehicleEventType;
     
    interface VehicleError : Error {
        const short ACCESS_DENIED = 1;
        const short NOT_AVAILABLE = 2;
        const short UNKNOWN = 0;
    };
     
    [NoInterfaceObject]
    interface VehicleEvent : Event {
    };
     
    [NoInterfaceObject]
    callback interface SuccessCallback {
        void onSuccess();
    };
     
    [NoInterfaceObject]
    callback interface ErrorCallback {
        void onError(VehicleError error);
    };
     
    interface VehicleDataHandler {
        void handleVehicleData(VehicleEvent data);
    };
 
    [NoInterfaceObject]
    interface Vehicle {
        readonly attribute VehicleInterface vehicle;
    };
    genivi implements Vehicle;
     
    [NoInterfaceObject]
    interface VehicleInterface : EventTarget {
        void get(VehicleEventType type, VehicleDataHandler handler, ErrorCallback errorCB);
        void set(VehicleEventType type, VehicleEvent data, SuccessCallback successCB, ErrorCallback errorCB);
        VehicleEventType[] getSupportedEventTypes(VehicleEventType type, boolean writable);
    };
     
    interface VehicleInfoEvent : VehicleEvent {
        const VehicleEventType VEHICLEINFO = "vehicleinfo";
        const VehicleEventType VEHICLEINFO_WMI = "vehicleinfo_wmi";
        const VehicleEventType VEHICLEINFO_VIN = "vehicleinfo_vin";
        const VehicleEventType VEHICLEINFO_VEHICLETYPE = "vehicleinfo_vehicletype";
        const VehicleEventType VEHICLEINFO_DOORTYPE = "vehicleinfo_doortype";
        const VehicleEventType VEHICLEINFO_DOORTYPE_1STROW = "vehicleinfo_doortype_1strow";
        const VehicleEventType VEHICLEINFO_DOORTYPE_2NDROW = "vehicleinfo_doortype_2ndrow";
        const VehicleEventType VEHICLEINFO_DOORTYPE_3RDROW = "vehicleinfo_doortype_3rdrow";
        const VehicleEventType VEHICLEINFO_FUELTYPE = "vehicleinfo_fueltype";
        const VehicleEventType VEHICLEINFO_TRANSMISSIONGEARTYPE = "vehicleinfo_transmissiongeartype";
        const VehicleEventType VEHICLEINFO_WHEELINFO = "vehicleinfo_wheelinfo";
        const VehicleEventType VEHICLEINFO_WHEELINFO_RADIUS = "vehicleinfo_wheelinfo_radius";
        const VehicleEventType VEHICLEINFO_WHEELINFO_TRACK = "vehicleinfo_wheelinfo_track";
         
        const unsigned short VEHICLETYPE_SEDAN = 1;
        const unsigned short VEHICLETYPE_COUPE = 2;
        const unsigned short VEHICLETYPE_CABRIOLET = 3;
        const unsigned short VEHICLETYPE_ROADSTER = 4;
        const unsigned short VEHICLETYPE_SUV = 5;
        const unsigned short VEHICLETYPE_TRUCK = 6;
 
        const octet FUELTYPE_GASOLINE = 0x01;
        const octet FUELTYPE_METHANOL= 0x02;
        const octet FUELTYPE_ETHANOL = 0x03;
        const octet FUELTYPE_DIESEL= 0x04;
        const octet FUELTYPE_LPG = 0x05;
        const octet FUELTYPE_CNG = 0x06;
        const octet FUELTYPE_PROPANE = 0x07;
        const octet FUELTYPE_ELECTRIC = 0x08;
        const octet FUELTYPE_BIFUELRUNNINGGASOLINE = 0x09;
        const octet FUELTYPE_BIFUELRUNNINGMETHANOL = 0x0A;
        const octet FUELTYPE_BIFUELRUNNINGETHANOL = 0x0B;
        const octet FUELTYPE_BIFUELRUNNINGLPG = 0x0C;
        const octet FUELTYPE_BIFUELRUNNINGCNG = 0x0D;
        const octet FUELTYPE_BIFUELRUNNINGPROP = 0x0E;
        const octet FUELTYPE_BIFUELRUNNINGELECTRICITY = 0x0F;
        const octet FUELTYPE_BIFUELMIXEDGASELECTRIC= 0x10;
        const octet FUELTYPE_HYBRIDGASOLINE = 0x11;
        const octet FUELTYPE_HYBRIDETHANOL = 0x12;
        const octet FUELTYPE_HYBRIDDIESEL = 0x13;
        const octet FUELTYPE_HYBRIDELECTRIC = 0x14;
        const octet FUELTYPE_HYBRIDMIXEDFUEL = 0x15;
        const octet FUELTYPE_HYBRIDREGENERATIVE = 0x16;
 
        const unsigned short TRANSMISSIONGEARTYPE_AUTO = 1;
        const unsigned short TRANSMISSIONGEARTYPE_MANUAL = 2;
        const unsigned short TRANSMISSIONGEARTYPE_CVT = 3;
 
        readonly attribute VehicleEventType type;
        readonly attribute DOMString wmi;
        readonly attribute DOMString vin;
        readonly attribute unsigned short? vehicleType;
        readonly attribute unsigned short? doorType1stRow;
        readonly attribute unsigned short? doorType2ndRow;
        readonly attribute unsigned short? doorType3rdRow;
        readonly attribute octet? fuelType;
        readonly attribute unsigned short? transmissionGearType;
        readonly attribute double? wheelInfoRadius;
        readonly attribute double? wheelInfoTrack;
    };
 
    interface RunningStatusEvent : VehicleEvent {
        const VehicleEventType RUNNINGSTATUS = "runningstatus";
        const VehicleEventType RUNNINGSTATUS_VEHICLEPOWERMODE = "runningstatus_vehiclepowermode";
        const VehicleEventType RUNNINGSTATUS_SPEEDOMETER = "runningstatus_speedometer";
        const VehicleEventType RUNNINGSTATUS_ENGINESPEED = "runningstatus_enginespeed";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER = "runningstatus_tripmeter";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_1 = "runningstatus_tripmeter_1";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_2 = "runningstatus_tripmeter_2";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_1_MILEAGE = "runningstatus_tripmeter_1_mileage";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_2_MILEAGE = "runningstatus_tripmeter_2_mileage";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_1_AVERAGESPEED = "runningstatus_tripmeter_1_averagespeed";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_2_AVERAGESPEED = "runningstatus_tripmeter_2_averagespeed";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_1_FUELCONSUMPTION = "runningstatus_tripmeter_1_fuelconsumption";
        const VehicleEventType RUNNINGSTATUS_TRIPMETER_2_FUELCONSUMPTION = "runningstatus_tripmeter_2_fuelconsumption";
        const VehicleEventType RUNNINGSTATUS_TRANSMISSIONGEARSTATUS = "runningstatus_transmissiongearstatus";
        const VehicleEventType RUNNINGSTATUS_CRUISECONTROL = "runningstatus_cruisecontrol";
        const VehicleEventType RUNNINGSTATUS_CRUISECONTROL_STATUS = "runningstatus_cruisecontrol_status";
        const VehicleEventType RUNNINGSTATUS_CRUISECONTROL_SPEED = "runningstatus_cruisecontrol_speed";
        const VehicleEventType RUNNINGSTATUS_WHEELBRAKE = "runningstatus_wheelbrake";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS = "runningstatus_lightsstatus";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_HEAD = "runningstatus_lightsstatus_head";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_HIGHBEAM = "runningstatus_lightsstatus_highbeam";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_TURNLEFT = "runningstatus_lightsstatus_turnleft";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_TURNRIGHT = "runningstatus_lightsstatus_turnright";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_BRAKE = "runningstatus_lightsstatus_brake";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_FOGFRONT = "runningstatus_lightsstatus_fogfront";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_FOGREAR = "runningstatus_lightsstatus_fogrear";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_HAZARD = "runningstatus_lightsstatus_hazard";
        const VehicleEventType RUNNINGSTATUS_LIGHTSSTATUS_PARKING = "runningstatus_lightsstatus_parking";
        const VehicleEventType RUNNINGSTATUS_INTERIORLIGHTSSTATUS = "runningstatus_interiorlightsstatus";
        const VehicleEventType RUNNINGSTATUS_INTERIORLIGHTSSTATUS_DRIVER = "runningstatus_interiorlightsstatus_driver";
        const VehicleEventType RUNNINGSTATUS_INTERIORLIGHTSSTATUS_PASSENGER = "runningstatus_interiorlightsstatus_passenger";
        const VehicleEventType RUNNINGSTATUS_INTERIORLIGHTSSTATUS_CENTER = "runningstatus_interiorlightsstatus_center";
        const VehicleEventType RUNNINGSTATUS_AUTOMATICHEADLIGHTS = "runningstatus_automaticheadlights";
        const VehicleEventType RUNNINGSTATUS_DYNAMICHIGHBEAM = "runningstatus_dynamichighbeam";
        const VehicleEventType RUNNINGSTATUS_HORN = "runningstatus_horn";
        const VehicleEventType RUNNINGSTATUS_CHIME = "runningstatus_chime";
        const VehicleEventType RUNNINGSTATUS_FUEL = "runningstatus_fuel";
        const VehicleEventType RUNNINGSTATUS_ESTIMATEDRANGE = "runningstatus_estimatedrange";
        const VehicleEventType RUNNINGSTATUS_ENGINEOIL = "runningstatus_engineoil";
        const VehicleEventType RUNNINGSTATUS_ENGINEOIL_REMAINING = "runningstatus_engineoil_remaining";
        const VehicleEventType RUNNINGSTATUS_ENGINEOIL_CHANGE = "runningstatus_engineoil_change";
        const VehicleEventType RUNNINGSTATUS_ENGINEOIL_TEMP = "runningstatus_engineoil_temp";
        const VehicleEventType RUNNINGSTATUS_ENGINECOOLANT = "runningstatus_enginecoolant";
        const VehicleEventType RUNNINGSTATUS_ENGINECOOLANT_LEVEL = "runningstatus_enginecoolant_level";
        const VehicleEventType RUNNINGSTATUS_ENGINECOOLANT_TEMP = "runningstatus_enginecoolant_temp";
        const VehicleEventType RUNNINGSTATUS_STEERINGWHEELANGLE = "runningstatus_steeringwheelangle";
 
        const unsigned short VEHICLEPOWERMODE_OFF = 1;
        const unsigned short VEHICLEPOWERMODE_ACC = 2;
        const unsigned short VEHICLEPOWERMODE_RUN = 3;
        const unsigned short VEHICLEPOWERMODE_IGNITION = 4;
 
        const unsigned short TRANSMISSIONGEARSTATUS_NEUTRAL = 0;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL1 = 1;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL2 = 2;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL3 = 3;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL4 = 4;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL5 = 5;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL6 = 6;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL7 = 7;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL8 = 8;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL9 = 9;
        const unsigned short TRANSMISSIONGEARSTATUS_MANUAL10 = 10;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO1 = 11;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO2 = 12;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO3 = 13;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO4 = 14;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO5 = 15;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO6 = 16;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO7 = 17;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO8 = 18;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO9 = 19;
        const unsigned short TRANSMISSIONGEARSTATUS_AUTO10 = 20;
        const unsigned short TRANSMISSIONGEARSTATUS_DRIVE = 32;
        const unsigned short TRANSMISSIONGEARSTATUS_PARKING = 64;
        const unsigned short TRANSMISSIONGEARSTATUS_REVERSE = 128;
 
        const unsigned short WHEELBRAKE_IDLE = 1;
        const unsigned short WHEELBRAKE_ENGAGED = 2;
        const unsigned short WHEELBRAKE_MALFUNCTION = 3;
 
        const unsigned short ENGINECOOLANTLEVEL_NORMAL = 0;
        const unsigned short ENGINECOOLANTLEVEL_LOW = 1;
 
        readonly attribute VehicleEventType type;
        readonly attribute unsigned short? vehiclePowerMode;
        readonly attribute unsigned short speedometer;
        readonly attribute unsigned short? engineSpeed;
        readonly attribute unsigned long? tripMeter1Mileage;
        readonly attribute unsigned long? tripMeter2Mileage;
        readonly attribute unsigned short? tripMeter1AverageSpeed;
        readonly attribute unsigned short? tripMeter2AverageSpeed;
        readonly attribute unsigned long? tripMeter1FuelConsumption;
        readonly attribute unsigned long? tripMeter2FuelConsumption;
        readonly attribute unsigned short? transmissionGearStatus;
        readonly attribute boolean? cruiseControlStatus;
        readonly attribute unsigned short? cruiseControlSpeed;
        readonly attribute unsigned short? wheelBrake;
        readonly attribute boolean? lightsStatusHead;
        readonly attribute boolean? lightsStatusHighBeam;
        readonly attribute boolean? lightsStatusTurnLeft;
        readonly attribute boolean? lightsStatusTurnRight;
        readonly attribute boolean? lightsStatusBrake;
        readonly attribute boolean? lightsStatusFogFront;
        readonly attribute boolean? lightsStatusFogRear;
        readonly attribute boolean? lightsStatusHazard;
        readonly attribute boolean? lightsStatusParking;
        readonly attribute boolean? interiorLightsStatusDriver;
        readonly attribute boolean? interiorLightsStatusPassenger;
        readonly attribute boolean? interiorLightsStatusCenter;
        readonly attribute boolean? automaticHeadlights;
        readonly attribute boolean? dynamicHighBeam;
        readonly attribute boolean? horn;
        readonly attribute boolean? chime;
        readonly attribute unsigned short fuel;
        readonly attribute unsigned long? estimatedRange;
        readonly attribute unsigned short? engineOilRemaining;
        readonly attribute boolean? engineOilChange;
        readonly attribute short? engineOilTemp;
        readonly attribute unsigned short? engineCoolantLevel;
        readonly attribute short? engineCoolantTemp;
        readonly attribute short? steeringWheelAngle;
    };
 
    interface MaintenanceEvent : VehicleEvent {
        const VehicleEventType MAINTENANCE = "maintenance";
        const VehicleEventType MAINTENANCE_ODOMETER = "maintenance_odometer";
        const VehicleEventType MAINTENANCE_TRANSMISSIONOIL = "maintenance_transmissionoil";
        const VehicleEventType MAINTENANCE_TRANSMISSIONOIL_LIFELEVEL = "maintenance_transmissionoil_lifelevel";
        const VehicleEventType MAINTENANCE_TRANSMISSIONOIL_TEMP = "maintenance_transmissionoil_temp";
        const VehicleEventType MAINTENANCE_BRAKEFLUIDLEVEL = "maintenance_brakefluidlevel";
        const VehicleEventType MAINTENANCE_WASHERFLUIDLEVEL = "maintenance_washerfluidlevel";
        const VehicleEventType MAINTENANCE_MALFUNCTIONINDICATORLAMP = "maintenance_malfunctionindicatorlamp";
        const VehicleEventType MAINTENANCE_BATTERY = "maintenance_battery";
        const VehicleEventType MAINTENANCE_BATTERY_VOLTAGE = "maintenance_battery_voltage";
        const VehicleEventType MAINTENANCE_BATTERY_CURRENT = "maintenance_battery_current";
        const VehicleEventType MAINTENANCE_TIREPRESSURE = "maintenance_tirepressure";
        const VehicleEventType MAINTENANCE_TIREPRESSURE_FRONTLEFT = "maintenance_tirepressure_frontleft";
        const VehicleEventType MAINTENANCE_TIREPRESSURE_FRONTRIGHT = "maintenance_tirepressure_frontright";
        const VehicleEventType MAINTENANCE_TIREPRESSURE_REARLEFT = "maintenance_tirepressure_rearleft";
        const VehicleEventType MAINTENANCE_TIREPRESSURE_REARRIGHT = "maintenance_tirepressure_rearright";
        const VehicleEventType MAINTENANCE_TIREPRESSURESTATUS = "maintenance_tirepressurestatus";
        const VehicleEventType MAINTENANCE_TIREPRESSURESTATUS_FRONTLEFT = "maintenance_tirepressurestatus_frontleft";
        const VehicleEventType MAINTENANCE_TIREPRESSURESTATUS_FRONTRIGHT = "maintenance_tirepressurestatus_frontright";
        const VehicleEventType MAINTENANCE_TIREPRESSURESTATUS_REARLEFT = "maintenance_tirepressurestatus_rearleft";
        const VehicleEventType MAINTENANCE_TIREPRESSURESTATUS_REARRIGHT = "maintenance_tirepressurestatus_rearright";
 
        const unsigned short TIREPRESSURESTATUS_NORMAL = 0;
        const unsigned short TIREPRESSURESTATUS_LOW = 1;
        const unsigned short TIREPRESSURESTATUS_HIGH = 2;
 
        readonly attribute VehicleEventType type;
        readonly attribute unsigned long odometer;
        readonly attribute boolean? transmissionOilLifeLevel;
        readonly attribute short? transmissionOilTemp;
        readonly attribute boolean? brakeFluidLevel;
        readonly attribute boolean? washerFluidLevel;
        readonly attribute boolean? malfunctionIndicatorLamp;
        readonly attribute unsigned short? batteryVoltage;
        readonly attribute unsigned short? batteryCurrent;
        readonly attribute unsigned short? tirePressureFrontLeft;
        readonly attribute unsigned short? tirePressureFrontRight;
        readonly attribute unsigned short? tirePressureRearLeft;
        readonly attribute unsigned short? tirePressureRearRight;
        readonly attribute unsigned short? tirePressureStatusFrontLeft;
        readonly attribute unsigned short? tirePressureStatusFrontRight;
        readonly attribute unsigned short? tirePressureStatusRearLeft;
        readonly attribute unsigned short? tirePressureStatusRearRight;
    };
 
    interface PersonalizationEvent : VehicleEvent {
        const VehicleEventType PERSONALIZATION = "personalization";
        const VehicleEventType PERSONALIZATION_KEYID = "personalization_keyid";
        const VehicleEventType PERSONALIZATION_LANGUAGE = "personalization_language";
        const VehicleEventType PERSONALIZATION_MEASUREMENTSYSTEM = "personalization_measurementsystem";
        const VehicleEventType PERSONALIZATION_MEASUREMENTSYSTEMSTRING = "personalization_measurementsystemstring";
        const VehicleEventType PERSONALIZATION_MEASUREMENTSYSTEMSTRING_FUEL = "personalization_measurementsystemstring_fuel";
        const VehicleEventType PERSONALIZATION_MEASUREMENTSYSTEMSTRING_DISTANCE = "personalization_measurementsystemstring_distance";
        const VehicleEventType PERSONALIZATION_MEASUREMENTSYSTEMSTRING_SPEED = "personalization_measurementsystemstring_speed";
        const VehicleEventType PERSONALIZATION_MEASUREMENTSYSTEMSTRING_CONSUMPTION = "personalization_measurementsystemstring_consumption";
        const VehicleEventType PERSONALIZATION_MIRROR = "personalization_mirror";
        const VehicleEventType PERSONALIZATION_MIRROR_DRIVER = "personalization_mirror_driver";
        const VehicleEventType PERSONALIZATION_MIRROR_PASSENGER = "personalization_mirror_passenger";
        const VehicleEventType PERSONALIZATION_MIRROR_INSIDE = "personalization_mirror_inside";
        const VehicleEventType PERSONALIZATION_STEERINGWHEELPOSITION = "personalization_steeringwheelposition";
        const VehicleEventType PERSONALIZATION_STEERINGWHEELPOSITION_SLIDE = "personalization_steeringwheelposition_slide";
        const VehicleEventType PERSONALIZATION_STEERINGWHEELPOSITION_TILT = "personalization_steeringwheelposition_tilt";
        const VehicleEventType PERSONALIZATION_DRIVINGMODE = "personalization_drivingmode";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION = "personalization_driverseatposition";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION_RECLINESEATBACK = "personalization_driverseatposition_reclineseatback";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION_SLIDE = "personalization_driverseatposition_slide";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION_CUSHIONHEIGHT = "personalization_driverseatposition_cushionheight";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION_HEADREST = "personalization_driverseatposition_headrest";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION_BACKCUSHION = "personalization_driverseatposition_backcushion";
        const VehicleEventType PERSONALIZATION_DRIVERSEATPOSITION_SIDECUSHION = "personalization_driverseatposition_sidecushion";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION = "personalization_passengerseatposition";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION_RECLINESEATBACK = "personalization_passengerseatposition_reclineseatback";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION_SLIDE = "personalization_passengerseatposition_slide";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION_CUSHIONHEIGHT = "personalization_passengerseatposition_cushionheight";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION_HEADREST = "personalization_passengerseatposition_headrest";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION_BACKCUSHION = "personalization_passengerseatposition_backcushion";
        const VehicleEventType PERSONALIZATION_PASSENGERSEATPOSITION_SIDECUSHION = "personalization_passengerseatposition_sidecushion";
        const VehicleEventType PERSONALIZATION_DASHBOARDILLUMINATION = "personalization_dashboardillumination";
        const VehicleEventType PERSONALIZATION_GENERATEDVEHICLESOUNDMODE = "personalization_generatedvehiclesoundmode";
 
        const unsigned short LANGUAGE_ENGLISH = 1;
        const unsigned short LANGUAGE_SPANISH = 2;
        const unsigned short LANGUAGE_FRENCH = 3;
 
        const unsigned short DRIVINGMODE_COMFORT = 1;
        const unsigned short DRIVINGMODE_AUTO = 2;
        const unsigned short DRIVINGMODE_SPORT = 3;
        const unsigned short DRIVINGMODE_ECO = 4;
        const unsigned short DRIVINGMODE_MANUAL = 5;
 
        const unsigned short GENERATEDVEHICLESOUNDMODE_NORMAL = 1;
        const unsigned short GENERATEDVEHICLESOUNDMODE_QUIET = 2;
        const unsigned short GENERATEDVEHICLESOUNDMODE_SPORTIVE = 3;
 
        readonly attribute VehicleEventType type;
        readonly attribute DOMString? keyId;
        readonly attribute unsigned short? language;
        readonly attribute boolean? measurementSystem;
        readonly attribute DOMString? measurementSystemStringFuel;
        readonly attribute DOMString? measurementSystemStringDistance;
        readonly attribute DOMString? measurementSystemStringSpeed;
        readonly attribute DOMString? measurementSystemStringConsumption;
        readonly attribute unsigned short? mirrorDriver;
        readonly attribute unsigned short? mirrorPassenger;
        readonly attribute unsigned short? mirrorInside;
        readonly attribute unsigned short? steeringWheelPositionSlide;
        readonly attribute unsigned short? steeringWheelPositionTilt;
        readonly attribute unsigned short? drivingMode;
        readonly attribute unsigned short? driverSeatPositionReclineSeatback;
        readonly attribute unsigned short? driverSeatPositionSlide;
        readonly attribute unsigned short? driverSeatPositionCushionHeight;
        readonly attribute unsigned short? driverSeatPositionHeadrest;
        readonly attribute unsigned short? driverSeatPositionBackCushion;
        readonly attribute unsigned short? driverSeatPositionSideCushion;
        readonly attribute unsigned short? passengerSeatPositionReclineSeatback;
        readonly attribute unsigned short? passengerSeatPositionSlide;
        readonly attribute unsigned short? passengerSeatPositionCushionHeight;
        readonly attribute unsigned short? passengerSeatPositionHeadrest;
        readonly attribute unsigned short? passengerSeatPositionBackCushion;
        readonly attribute unsigned short? passengerSeatPositionSideCushion;
        readonly attribute unsigned short? dashboardIllumination;
        readonly attribute unsigned short? generatedVehicleSoundMode;
    };
 
    interface DrivingSafetyEvent : VehicleEvent {
        const VehicleEventType DRIVINGSAFETY = "drivingsafety";
        const VehicleEventType DRIVINGSAFETY_ANTILOCKBRAKINGSYSTEM = "drivingsafety_antilockbrakingsystem";
        const VehicleEventType DRIVINGSAFETY_TRACTIONCONTROLSYSTEM = "drivingsafety_tractioncontrolsystem";
        const VehicleEventType DRIVINGSAFETY_ELECTRONICSTABILITYCONTROL = "drivingsafety_electronicstabilitycontrol";
        const VehicleEventType DRIVINGSAFETY_VEHICLETOPSPEEDLIMIT = "drivingsafety_vehicletopspeedlimit";
        const VehicleEventType DRIVINGSAFETY_AIRBAGSTATUS = "drivingsafety_airbagstatus";
        const VehicleEventType DRIVINGSAFETY_AIRBAGSTATUS_DRIVER = "drivingsafety_airbagstatus_driver";
        const VehicleEventType DRIVINGSAFETY_AIRBAGSTATUS_PASSENGER = "drivingsafety_airbagstatus_passenger";
        const VehicleEventType DRIVINGSAFETY_AIRBAGSTATUS_SIDE = "drivingsafety_airbagstatus_side";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS = "drivingsafety_dooropenstatus";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_DRIVER = "drivingsafety_dooropenstatus_driver";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_PASSENGER = "drivingsafety_dooropenstatus_passenger";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_REARLEFT = "drivingsafety_dooropenstatus_rearleft";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_REARRIGHT = "drivingsafety_dooropenstatus_rearright";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_TRUNK = "drivingsafety_dooropenstatus_trunk";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_FUELFILTERCAP = "drivingsafety_dooropenstatus_fuelfiltercap";
        const VehicleEventType DRIVINGSAFETY_DOOROPENSTATUS_HOOD = "drivingsafety_dooropenstatus_hood";
        const VehicleEventType DRIVINGSAFETY_DOORLOCKSTATUS = "drivingsafety_doorlockstatus";
        const VehicleEventType DRIVINGSAFETY_DOORLOCKSTATUS_DRIVER = "drivingsafety_doorlockstatus_driver";
        const VehicleEventType DRIVINGSAFETY_DOORLOCKSTATUS_PASSENGER = "drivingsafety_doorlockstatus_passenger";
        const VehicleEventType DRIVINGSAFETY_DOORLOCKSTATUS_REARLEFT = "drivingsafety_doorlockstatus_rearleft";
        const VehicleEventType DRIVINGSAFETY_DOORLOCKSTATUS_REARRIGHT = "drivingsafety_doorlockstatus_rearright";
        const VehicleEventType DRIVINGSAFETY_CHILDSAFETYLOCK = "drivingsafety_childsafetylock";
        const VehicleEventType DRIVINGSAFETY_OCCUPANTSSTATUS = "drivingsafety_occupantsstatus";
        const VehicleEventType DRIVINGSAFETY_OCCUPANTSSTATUS_DRIVER = "drivingsafety_occupantsstatus_driver";
        const VehicleEventType DRIVINGSAFETY_OCCUPANTSSTATUS_PASSENGER = "drivingsafety_occupantsstatus_passenger";
        const VehicleEventType DRIVINGSAFETY_OCCUPANTSSTATUS_REARLEFT = "drivingsafety_occupantsstatus_rearleft";
        const VehicleEventType DRIVINGSAFETY_OCCUPANTSSTATUS_REARRIGHT = "drivingsafety_occupantsstatus_rearright";
        const VehicleEventType DRIVINGSAFETY_SEATBELT = "drivingsafety_seatbelt";
        const VehicleEventType DRIVINGSAFETY_SEATBELT_DRIVER = "drivingsafety_seatbelt_driver";
        const VehicleEventType DRIVINGSAFETY_SEATBELT_PASSENGER = "drivingsafety_seatbelt_passenger";
        const VehicleEventType DRIVINGSAFETY_SEATBELT_REARLEFT = "drivingsafety_seatbelt_rearleft";
        const VehicleEventType DRIVINGSAFETY_SEATBELT_REARRIGHT = "drivingsafety_seatbelt_rearright";
        const VehicleEventType DRIVINGSAFETY_WINDOWLOCK = "drivingsafety_windowlock";
        const VehicleEventType DRIVINGSAFETY_WINDOWLOCK_DRIVER = "drivingsafety_windowlock_driver";
        const VehicleEventType DRIVINGSAFETY_WINDOWLOCK_PASSENGER = "drivingsafety_windowlock_passenger";
        const VehicleEventType DRIVINGSAFETY_WINDOWLOCK_REARLEFT = "drivingsafety_windowlock_rearleft";
        const VehicleEventType DRIVINGSAFETY_WINDOWLOCK_REARRIGHT = "drivingsafety_windowlock_rearright";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE = "drivingsafety_obstacledistance";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_SENSORSTATUS = "drivingsafety_obstacledistance_sensorstatus";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_FRONTCENTER = "drivingsafety_obstacledistance_frontcenter";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_REARCENTER = "drivingsafety_obstacledistance_rearcenter";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_FRONTLEFT = "drivingsafety_obstacledistance_frontleft";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_FRONTRIGHT = "drivingsafety_obstacledistance_frontright";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_MIDDLELEFT = "drivingsafety_obstacledistance_middleleft";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_MIDDLERIGHT = "drivingsafety_obstacledistance_middleright";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_REARLEFT = "drivingsafety_obstacledistance_rearleft";
        const VehicleEventType DRIVINGSAFETY_OBSTACLEDISTANCE_REARRIGHT = "drivingsafety_obstacledistance_rearright";
        const VehicleEventType DRIVINGSAFETY_FRONTCOLLISIONDETECTION = "drivingsafety_frontcollisiondetection";
        const VehicleEventType DRIVINGSAFETY_FRONTCOLLISIONDETECTION_STATUS = "drivingsafety_frontcollisiondetection_status";
        const VehicleEventType DRIVINGSAFETY_FRONTCOLLISIONDETECTION_DISTANCE = "drivingsafety_frontcollisiondetection_distance";
        const VehicleEventType DRIVINGSAFETY_FRONTCOLLISIONDETECTION_TIME = "drivingsafety_frontcollisiondetection_time";
 
        const unsigned short ANTILOCKBRAKINGSYSTEM_AVAILABLE = 1;
        const unsigned short ANTILOCKBRAKINGSYSTEM_IDLE = 2;
        const unsigned short ANTILOCKBRAKINGSYSTEM_ENGAGED = 3;
 
        const unsigned short TRACTIONCONTROLSYSTEM_AVAILABLE = 1;
        const unsigned short TRACTIONCONTROLSYSTEM_IDLE = 2;
        const unsigned short TRACTIONCONTROLSYSTEM_ENGAGED = 3;
 
        const unsigned short ELECTRONICSTABILITYCONTROL_AVAILABLE = 1;
        const unsigned short ELECTRONICSTABILITYCONTROL_IDLE = 2;
        const unsigned short ELECTRONICSTABILITYCONTROL_ENGAGED = 3;
 
        const unsigned short AIRBAGSTATUS_ACTIVATE = 1;
        const unsigned short AIRBAGSTATUS_DEACTIVATE = 2;
        const unsigned short AIRBAGSTATUS_DEPLOYMENT = 3;
 
        const unsigned short DOOROPENSTATUS_OPEN = 1;
        const unsigned short DOOROPENSTATUS_AJAR = 2;
        const unsigned short DOOROPENSTATUS_CLOSE = 3;
 
        const unsigned short OCCUPANTSSTATUS_ADULT = 1;
        const unsigned short OCCUPANTSSTATUS_CHILD = 2;
        const unsigned short OCCUPANTSSTATUS_VACANT = 3;
 
        readonly attribute VehicleEventType type;
        readonly attribute unsigned short? antilockBrakingSystem;
        readonly attribute unsigned short? tractionControlSystem;
        readonly attribute unsigned short? electronicStabilityControl;
        readonly attribute unsigned short? vehicleTopSpeedLimit;
        readonly attribute unsigned short? airbagStatusDriver;
        readonly attribute unsigned short? airbagStatusPassenger;
        readonly attribute unsigned short? airbagStatusSide;
        readonly attribute unsigned short? doorOpenStatusDriver;
        readonly attribute unsigned short? doorOpenStatusPassenger;
        readonly attribute unsigned short? doorOpenStatusRearLeft;
        readonly attribute unsigned short? doorOpenStatusRearRight;
        readonly attribute unsigned short? doorOpenStatusTrunk;
        readonly attribute unsigned short? doorOpenStatusFuelFilterCap;
        readonly attribute unsigned short? doorOpenStatusHood;
        readonly attribute boolean? doorLockStatusDriver;
        readonly attribute boolean? doorLockStatusPassenger;
        readonly attribute boolean? doorLockStatusRearLeft;
        readonly attribute boolean? doorLockStatusRearRight;
        readonly attribute boolean? childSafetyLock;
        readonly attribute unsigned short? occupantsStatusDriver;
        readonly attribute unsigned short? occupantsStatusPassenger;
        readonly attribute unsigned short? occupantsStatusRearLeft;
        readonly attribute unsigned short? occupantsStatusRearRight;
        readonly attribute boolean? seatBeltDriver;
        readonly attribute boolean? seatBeltPassenger;
        readonly attribute boolean? seatBeltRearLeft;
        readonly attribute boolean? seatBeltRearRight;
        readonly attribute boolean? windowLockDriver;
        readonly attribute boolean? windowLockPassenger;
        readonly attribute boolean? windowLockRearLeft;
        readonly attribute boolean? windowLockRearRight;
        readonly attribute boolean? obstacleDistanceSensorStatus;
        readonly attribute unsigned short? obstacleDistanceFrontCenter;
        readonly attribute unsigned short? obstacleDistanceRearCenter;
        readonly attribute unsigned short? obstacleDistanceFrontLeft;
        readonly attribute unsigned short? obstacleDistanceFrontRight;
        readonly attribute unsigned short? obstacleDistanceMiddleLeft;
        readonly attribute unsigned short? obstacleDistanceMiddleRight;
        readonly attribute unsigned short? obstacleDistanceRearLeft;
        readonly attribute unsigned short? obstacleDistanceRearRight;
        readonly attribute boolean? frontCollisionDetectionStatus;
        readonly attribute unsigned long? frontCollisionDetectionDistance;
        readonly attribute unsigned long? frontCollisionDetectionTime;
    };
 
    interface VisionSystemEvent : VehicleEvent {
        const VehicleEventType VISIONSYSTEM = "visionsystem";
        const VehicleEventType VISIONSYSTEM_LANEDEPARTUREDETECTIONSTATUS = "visionsystem_lanedeparturedetectionstatus";
        const VehicleEventType VISIONSYSTEM_LANEDEPARTED = "visionsystem_lanedeparted";
     
        readonly attribute VehicleEventType type;
        readonly attribute boolean? laneDepartureDetectionStatus;
        readonly attribute boolean? laneDeparted;
    };
 
    interface ParkingEvent : VehicleEvent {
        const VehicleEventType PARKING = "parking";
        const VehicleEventType PARKING_SECURITYALERT = "parking_securityalert";
        const VehicleEventType PARKING_PARKINGBRAKE = "parking_parkingbrake";
        const VehicleEventType PARKING_PARKINGLIGHTS = "parking_parkinglights";
 
        const unsigned short SECURITYALERT_AVAILABLE = 1;
        const unsigned short SECURITYALERT_IDLE = 2;
        const unsigned short SECURITYALERT_ACTIVATED = 3;
        const unsigned short SECURITYALERT_ALARM_DETECTED = 4;
 
        readonly attribute VehicleEventType type;
        readonly attribute unsigned short? securityAlert;
        readonly attribute boolean? parkingBrake;
        readonly attribute boolean? parkingLights;
    };
 
    interface ClimateEnvironmentEvent : VehicleEvent {
        const VehicleEventType CLIMATEENVIRONMENT = "climateenvironment";
        const VehicleEventType CLIMATEENVIRONMENT_INTERIORTEMP = "climateenvironment_interiortemp";
        const VehicleEventType CLIMATEENVIRONMENT_EXTERIORTEMP = "climateenvironment_exteriortemp";
        const VehicleEventType CLIMATEENVIRONMENT_EXTERIORBRIGHTNESS = "climateenvironment_exteriorbrightness";
        const VehicleEventType CLIMATEENVIRONMENT_RAINSENSOR = "climateenvironment_rainsensor";
        const VehicleEventType CLIMATEENVIRONMENT_WINDSHIELDWIPER = "climateenvironment_windshieldwiper";
        const VehicleEventType CLIMATEENVIRONMENT_REARWIPER = "climateenvironment_rearwiper";
        const VehicleEventType CLIMATEENVIRONMENT_HVACFAN = "climateenvironment_hvacfan";
        const VehicleEventType CLIMATEENVIRONMENT_HVACFAN_DIRECTION = "climateenvironment_hvacfan_direction";
        const VehicleEventType CLIMATEENVIRONMENT_HVACFAN_SPEED = "climateenvironment_hvacfan_speed";
        const VehicleEventType CLIMATEENVIRONMENT_HVACFAN_TARGETTEMP = "climateenvironment_hvacfan_targettemp";
        const VehicleEventType CLIMATEENVIRONMENT_AIRCONDITIONING = "climateenvironment_airconditioning";
        const VehicleEventType CLIMATEENVIRONMENT_AIRRECIRCULATION = "climateenvironment_airrecirculation";
        const VehicleEventType CLIMATEENVIRONMENT_HEATER = "climateenvironment_heater";
        const VehicleEventType CLIMATEENVIRONMENT_DEFROST = "climateenvironment_defrost";
        const VehicleEventType CLIMATEENVIRONMENT_DEFROST_WINDSHIELD = "climateenvironment_defrost_windshield";
        const VehicleEventType CLIMATEENVIRONMENT_DEFROST_REARWINDOW = "climateenvironment_defrost_rearwindow";
        const VehicleEventType CLIMATEENVIRONMENT_DEFROST_SIDEMIRRORS = "climateenvironment_defrost_sidemirrors";
        const VehicleEventType CLIMATEENVIRONMENT_STEERINGWHEELHEATER = "climateenvironment_steeringwheelheater";
        const VehicleEventType CLIMATEENVIRONMENT_SEATHEATER = "climateenvironment_seatheater";
        const VehicleEventType CLIMATEENVIRONMENT_SEATCOOLER = "climateenvironment_seatcooler";
        const VehicleEventType CLIMATEENVIRONMENT_WINDOW = "climateenvironment_window";
        const VehicleEventType CLIMATEENVIRONMENT_WINDOW_DRIVER = "climateenvironment_window_driver";
        const VehicleEventType CLIMATEENVIRONMENT_WINDOW_PASSENGER = "climateenvironment_window_passenger";
        const VehicleEventType CLIMATEENVIRONMENT_WINDOW_REARLEFT = "climateenvironment_window_rearleft";
        const VehicleEventType CLIMATEENVIRONMENT_WINDOW_REARRIGHT = "climateenvironment_window_rearright";
        const VehicleEventType CLIMATEENVIRONMENT_SUNROOF = "climateenvironment_sunroof";
        const VehicleEventType CLIMATEENVIRONMENT_SUNROOF_OPENNESS = "climateenvironment_sunroof_openness";
        const VehicleEventType CLIMATEENVIRONMENT_SUNROOF_TILT = "climateenvironment_sunroof_tilt";
        const VehicleEventType CLIMATEENVIRONMENT_CONVERTIBLEROOF = "climateenvironment_convertibleroof";
 
        const unsigned short RAINSENSOR_NORAIN = 0;
        const unsigned short RAINSENSOR_LEVEL1 = 1;
        const unsigned short RAINSENSOR_LEVEL2 = 2;
        const unsigned short RAINSENSOR_LEVEL3 = 3;
        const unsigned short RAINSENSOR_LEVEL4 = 4;
        const unsigned short RAINSENSOR_LEVEL5 = 5;
        const unsigned short RAINSENSOR_LEVEL6 = 6;
        const unsigned short RAINSENSOR_LEVEL7 = 7;
        const unsigned short RAINSENSOR_LEVEL8 = 8;
        const unsigned short RAINSENSOR_LEVEL9 = 9;
        const unsigned short RAINSENSOR_HEAVIESTRAIN = 10;
 
        const unsigned short WIPER_OFF = 0;
        const unsigned short WIPER_ONCE = 1;
        const unsigned short WIPER_SLOWEST = 2;
        const unsigned short WIPER_SLOW = 3;
        const unsigned short WIPER_FAST = 4;
        const unsigned short WIPER_FASTEST = 5;
        const unsigned short WIPER_AUTO = 10;
 
        const unsigned short HVACFAN_DIRECTION_FRONTPANEL = 1;
        const unsigned short HVACFAN_DIRECTION_FLOORDUCT = 2;
        const unsigned short HVACFAN_DIRECTION_FRONTFLOOR = 3;
        const unsigned short HVACFAN_DIRECTION_DEFROSTERFLOOR = 4;
 
        readonly attribute VehicleEventType type;
        readonly attribute short? interiorTemp;
        readonly attribute short? exteriorTemp;
        readonly attribute unsigned long? exteriorBrightness;
        readonly attribute unsigned short? rainSensor;
        readonly attribute unsigned short? windshieldWiper;
        readonly attribute unsigned short? rearWiper;
        readonly attribute unsigned short? hvacFanDirection;
        readonly attribute unsigned short? hvacFanSpeed;
        readonly attribute short? hvacFanTargetTemp;
        readonly attribute boolean? airConditioning;
        readonly attribute boolean? airRecirculation;
        readonly attribute boolean? heater;
        readonly attribute boolean? defrostWindshield;
        readonly attribute boolean? defrostRearWindow;
        readonly attribute boolean? defrostSideMirrors;
        readonly attribute boolean? steeringWheelHeater;
        readonly attribute boolean? seatHeater;
        readonly attribute boolean? seatCooler;
        readonly attribute unsigned short? windowDriver;
        readonly attribute unsigned short? windowPassenger;
        readonly attribute unsigned short? windowRearLeft;
        readonly attribute unsigned short? windowRearRight;
        readonly attribute unsigned short? sunroofOpenness;
        readonly attribute unsigned short? sunroofTilt;
        readonly attribute boolean? convertibleRoof;
    };
}
