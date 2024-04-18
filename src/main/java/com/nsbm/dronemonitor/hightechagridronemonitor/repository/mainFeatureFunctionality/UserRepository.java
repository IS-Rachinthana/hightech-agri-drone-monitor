package com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    UserModel findByUserEmail(String userEmail);
}
