package com.k1m2njun.getinline.controller.api;

import com.k1m2njun.getinline.constant.PlaceType;
import com.k1m2njun.getinline.dto.APIDataResponse;
import com.k1m2njun.getinline.dto.PlaceDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public APIDataResponse<List<PlaceDto>> getPlaces() {
        return APIDataResponse.of(List.of(PlaceDto.of(
                PlaceType.COMMON,
                "랄라배드민턴장",
                "서울시 대전시",
                "010-3333-1323",
                30,
                "신장개업"
        )));
//        return List.of("place1", "place2");
    }

    @PostMapping("/places")
    public Boolean createPlace() {
        return true;
    }

    @GetMapping("/places/{placeId}")
    public APIDataResponse<PlaceDto> getPlace(@PathVariable Integer placeId) {
        if (placeId.equals(2)) {
            return APIDataResponse.of(null);
        }
        return APIDataResponse.of(PlaceDto.of(
                PlaceType.COMMON,
                "랄라배드민턴장",
                "서울시 대전시",
                "010-3333-1323",
                30,
                "신장개업"
        ));
//        return "place " + placeId;
    }

    @PutMapping("/places/{placeId}")
    public Boolean modifyPlace(@PathVariable Integer placeId) {
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public Boolean removePlace(@PathVariable Integer placeId) {
        return true;
    }
}
