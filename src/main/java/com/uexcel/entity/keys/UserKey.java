package com.uexcel.entity.keys;

import java.io.Serializable;

public class UserKey implements Serializable {

    private String workCode;

    private String projectCode;

    public UserKey(String workCode, String projectCode) {
        this.workCode = workCode;
        this.projectCode = projectCode;
    }

    public UserKey() {
    }

    public String getWorkCode() {
        return workCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    @Override
    public String toString() {
        return "UserKey [workCode=" + workCode + ", projectCode=" + projectCode + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((workCode == null) ? 0 : workCode.hashCode());
        result = prime * result + ((projectCode == null) ? 0 : projectCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserKey other = (UserKey) obj;
        if (workCode == null) {
            if (other.workCode != null)
                return false;
        } else if (!workCode.equals(other.workCode))
            return false;
        if (projectCode == null) {
            if (other.projectCode != null)
                return false;
        } else if (!projectCode.equals(other.projectCode))
            return false;
        return true;
    }

}
