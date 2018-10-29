package org.opencds.cqf.qdm.model;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;

@ResourceDef(name="EncounterRecommended", profile="TODO")
public abstract class EncounterRecommended extends QdmBaseType {

    @Child(name="authorDatetime", order=0)
    DateTimeType authorDatetime;
    public DateTimeType getAuthorDatetime() {
        return authorDatetime;
    }
    public EncounterRecommended setAuthorDatetime(DateTimeType authorDatetime) {
        this.authorDatetime = authorDatetime;
        return this;
    }
	
    @Child(name="reason", order=1)
    Coding reason;
    public Coding getReason() {
        return reason;
    }
    public EncounterRecommended setReason(Coding reason) {
        this.reason = reason;
        return this;
    }

    @Child(name="facilityLocation", order=2)
    Coding facilityLocation;
    public Coding getFacilityLocation() {
        return facilityLocation;
    }
    public EncounterRecommended setFacilityLocation(Coding facilityLocation) {
        this.facilityLocation = facilityLocation;
        return this;
    }
	
    @Child(name="negationRationale", order=3)
    Coding negationRationale;
    public Coding getNegationRationale() {
        return negationRationale;
    }
    public EncounterRecommended setNegationRationale(Coding negationRationale) {
        this.negationRationale = negationRationale;
        return this;
    }
}
