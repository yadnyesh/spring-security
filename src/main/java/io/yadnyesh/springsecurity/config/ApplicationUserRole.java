package io.yadnyesh.springsecurity.config;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

import static io.yadnyesh.springsecurity.config.ApplicationUserPermission.*;

@Getter
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

}
