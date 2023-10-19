//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// ReviewObject - Details for the roles and/or groups that need to be reviewed
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewObject {
    public String domainName;
    public String name;
    public int memberExpiryDays;
    public int memberReviewDays;
    public int serviceExpiryDays;
    public int serviceReviewDays;
    public int groupExpiryDays;
    public int groupReviewDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp lastReviewedDate;

    public ReviewObject setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return domainName;
    }
    public ReviewObject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public ReviewObject setMemberExpiryDays(int memberExpiryDays) {
        this.memberExpiryDays = memberExpiryDays;
        return this;
    }
    public int getMemberExpiryDays() {
        return memberExpiryDays;
    }
    public ReviewObject setMemberReviewDays(int memberReviewDays) {
        this.memberReviewDays = memberReviewDays;
        return this;
    }
    public int getMemberReviewDays() {
        return memberReviewDays;
    }
    public ReviewObject setServiceExpiryDays(int serviceExpiryDays) {
        this.serviceExpiryDays = serviceExpiryDays;
        return this;
    }
    public int getServiceExpiryDays() {
        return serviceExpiryDays;
    }
    public ReviewObject setServiceReviewDays(int serviceReviewDays) {
        this.serviceReviewDays = serviceReviewDays;
        return this;
    }
    public int getServiceReviewDays() {
        return serviceReviewDays;
    }
    public ReviewObject setGroupExpiryDays(int groupExpiryDays) {
        this.groupExpiryDays = groupExpiryDays;
        return this;
    }
    public int getGroupExpiryDays() {
        return groupExpiryDays;
    }
    public ReviewObject setGroupReviewDays(int groupReviewDays) {
        this.groupReviewDays = groupReviewDays;
        return this;
    }
    public int getGroupReviewDays() {
        return groupReviewDays;
    }
    public ReviewObject setLastReviewedDate(Timestamp lastReviewedDate) {
        this.lastReviewedDate = lastReviewedDate;
        return this;
    }
    public Timestamp getLastReviewedDate() {
        return lastReviewedDate;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != ReviewObject.class) {
                return false;
            }
            ReviewObject a = (ReviewObject) another;
            if (domainName == null ? a.domainName != null : !domainName.equals(a.domainName)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (memberExpiryDays != a.memberExpiryDays) {
                return false;
            }
            if (memberReviewDays != a.memberReviewDays) {
                return false;
            }
            if (serviceExpiryDays != a.serviceExpiryDays) {
                return false;
            }
            if (serviceReviewDays != a.serviceReviewDays) {
                return false;
            }
            if (groupExpiryDays != a.groupExpiryDays) {
                return false;
            }
            if (groupReviewDays != a.groupReviewDays) {
                return false;
            }
            if (lastReviewedDate == null ? a.lastReviewedDate != null : !lastReviewedDate.equals(a.lastReviewedDate)) {
                return false;
            }
        }
        return true;
    }
}
