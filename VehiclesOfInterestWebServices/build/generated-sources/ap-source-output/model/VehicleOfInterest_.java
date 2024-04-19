package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ReasonForInterest;
import model.VehicleMake;
import model.VehicleModel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-01T15:13:23")
@StaticMetamodel(VehicleOfInterest.class)
public class VehicleOfInterest_ { 

    public static volatile SingularAttribute<VehicleOfInterest, ReasonForInterest> reason;
    public static volatile SingularAttribute<VehicleOfInterest, String> licensePlate;
    public static volatile SingularAttribute<VehicleOfInterest, String> color;
    public static volatile SingularAttribute<VehicleOfInterest, String> ownersPhone;
    public static volatile SingularAttribute<VehicleOfInterest, String> vehYear;
    public static volatile SingularAttribute<VehicleOfInterest, VehicleModel> model;
    public static volatile SingularAttribute<VehicleOfInterest, String> ownersName;
    public static volatile SingularAttribute<VehicleOfInterest, VehicleMake> make;

}