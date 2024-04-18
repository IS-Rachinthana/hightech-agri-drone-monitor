package com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.UserRegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistrationModel, Integer> {
    // You might add custom methods here if needed
}
