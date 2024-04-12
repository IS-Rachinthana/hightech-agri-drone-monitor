package com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.UserModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.userRegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByUserEmail(String userEmail);
}
