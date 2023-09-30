package com.sold.easy.repositories.Profile;

import com.sold.easy.model.car.Profile;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>
{
	Optional<Profile> findByName(String name);

	Optional<Profile> findbyEmail(String email);
}
