package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VehicleOfInterest;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-01T15:13:23")
@StaticMetamodel(ReasonForInterest.class)
public class ReasonForInterest_ { 

    public static volatile SingularAttribute<ReasonForInterest, String> reason;
    public static volatile CollectionAttribute<ReasonForInterest, VehicleOfInterest> vehicleOfInterestCollection;
    public static volatile SingularAttribute<ReasonForInterest, String> description;

}