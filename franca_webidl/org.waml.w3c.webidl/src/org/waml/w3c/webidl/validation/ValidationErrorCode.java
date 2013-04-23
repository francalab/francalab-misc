package org.waml.w3c.webidl.validation;

public class ValidationErrorCode {
	
	public static final int OPERATION_MUST_BE_SPECIAL = 0x100;
	public static final int VARIADIC_OPERATOR_NOT_FINAL_ARG = 0x101;
	public static final int LAST_OPTIONAL_ARG = 0x102;
	public static final int OPERATION_OMITTABLE = 0x103;
	public static final int SPECIAL_KEYWORD_NOT_UNIQUE = 0x104;
	public static final int TOO_MUCH_SPECIAL_INTERFACE_MEMBERS = 0x105;
	public static final int SPECIAL_OPERATION_VARIADIC_OR_WITH_OPTIONAL_ARGS = 0x106;
	public static final int STRINGIFIER_OPERATION_HAS_ARGS_OR_NOT_RETURNS_DOMSTRING = 0x107;
	public static final int STRINGIFIER_ATTRIBUTE_NOT_DOMSTRING = 0x108;
	public static final int INVALID_GETTER_DELETER_CREATOR_SETTER_OPERATION = 0x108;
}
