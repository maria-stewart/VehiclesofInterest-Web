package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VehicleModel;
import model.VehicleOfInterest;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-01T15:13:23")
@StaticMetamodel(VehicleMake.class)
public class VehicleMake_ { 

    public static volatile CollectionAttribute<VehicleMake, VehicleOfInterest> vehicleOfInterestCollection;
    public static volatile CollectionAttribute<VehicleMake, VehicleModel> vehicleModelCollection;
    public static volatile SingularAttribute<VehicleMake, String> make;

}