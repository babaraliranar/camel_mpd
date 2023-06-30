/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.drive.Drive.Permissions;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.drive.Drive$Permissions
 */
public enum DrivePermissionsApiMethod implements ApiMethod {

    DELETE(
        com.google.api.services.drive.Drive.Permissions.Delete.class,
        "delete",
        arg("fileId", String.class),
        arg("permissionId", String.class)),

    GET(
        com.google.api.services.drive.Drive.Permissions.Get.class,
        "get",
        arg("fileId", String.class),
        arg("permissionId", String.class)),

    GET_ID_FOR_EMAIL(
        com.google.api.services.drive.Drive.Permissions.GetIdForEmail.class,
        "getIdForEmail",
        arg("email", String.class)),

    INSERT(
        com.google.api.services.drive.Drive.Permissions.Insert.class,
        "insert",
        arg("fileId", String.class),
        arg("content", com.google.api.services.drive.model.Permission.class)),

    LIST(
        com.google.api.services.drive.Drive.Permissions.List.class,
        "list",
        arg("fileId", String.class)),

    PATCH(
        com.google.api.services.drive.Drive.Permissions.Patch.class,
        "patch",
        arg("fileId", String.class),
        arg("permissionId", String.class),
        arg("content", com.google.api.services.drive.model.Permission.class)),

    UPDATE(
        com.google.api.services.drive.Drive.Permissions.Update.class,
        "update",
        arg("fileId", String.class),
        arg("permissionId", String.class),
        arg("content", com.google.api.services.drive.model.Permission.class));

    private final ApiMethod apiMethod;

    private DrivePermissionsApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Permissions.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
