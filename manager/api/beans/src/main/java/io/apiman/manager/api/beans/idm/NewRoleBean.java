/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.apiman.manager.api.beans.idm;

import java.io.Serializable;
import java.util.Set;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * Bean used when creating a new role.
 *
 * @author eric.wittmann@redhat.com
 */
@Portable
public class NewRoleBean implements Serializable {

    private static final long serialVersionUID = -3926221739472762893L;
    
    private String name;
    private String description;
    private Boolean autoGrant;
    private Set<PermissionType> permissions;
    
    /**
     * Constructor.
     */
    public NewRoleBean() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the permissions
     */
    public Set<PermissionType> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(Set<PermissionType> permissions) {
        this.permissions = permissions;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the autoGrant
     */
    public Boolean getAutoGrant() {
        return autoGrant;
    }

    /**
     * @param autoGrant the autoGrant to set
     */
    public void setAutoGrant(Boolean autoGrant) {
        this.autoGrant = autoGrant;
    }
    
}
