package com.sold.easy.repositories.Owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sold.easy.model.car.owner.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long>
{

}
