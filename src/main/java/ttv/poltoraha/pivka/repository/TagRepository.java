package ttv.poltoraha.pivka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ttv.poltoraha.pivka.entity.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Integer> {
}
