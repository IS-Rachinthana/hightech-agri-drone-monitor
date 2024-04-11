package com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.userRegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRegistrationRepository extends JpaRepository<userRegistrationModel, Integer> {
    // You might add custom methods here if needed
}
