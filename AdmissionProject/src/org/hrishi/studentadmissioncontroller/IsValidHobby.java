package org.hrishi.studentadmissioncontroller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Documented;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)


public @interface IsValidHobby {
	String message() default "Please provide a valid hobby:"+
				"accepted hobbies are: cricket, football, music";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};

}
