package umc.spring.repository.RegionRepository;

import umc.spring.domain.Region;

public interface RegionRepositoryCustom {

    Region findRegionByName(String name);

}
