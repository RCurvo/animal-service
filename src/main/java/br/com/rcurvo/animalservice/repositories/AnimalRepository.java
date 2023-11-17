package br.com.rcurvo.animalservice.repositories;

import br.com.rcurvo.animalservice.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NULL ORDER BY a.entryDate")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.adoptionDate IS NOT NULL ORDER BY a.entryDate")
    List<Animal> findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.species='cat'")
    List<Animal> findAllCats();

    @Query("SELECT a FROM Animal a WHERE a.species='dog'")
    List<Animal> findAllDogs();

    @Query("SELECT a.receptorName, COUNT(a.receptorName) FROM Animal a GROUP BY a.receptorName")
    List<Object[]> countRescuesByReceptor();








}
