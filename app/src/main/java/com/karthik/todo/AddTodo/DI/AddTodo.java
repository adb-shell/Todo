package com.karthik.todo.AddTodo.DI;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by karthikr on 8/8/17.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AddTodo {
}
