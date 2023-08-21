package com.h1.mycardeepdive.color.ui;

import com.h1.mycardeepdive.color.service.ColorService;
import com.h1.mycardeepdive.color.ui.dto.AllColorResponse;
import com.h1.mycardeepdive.color.ui.dto.ExteriorColorResponse;
import com.h1.mycardeepdive.color.ui.dto.InteriorColorResponse;
import com.h1.mycardeepdive.global.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/color")
public class ColorController {
    private final ColorService colorService;

    @GetMapping("/exterior-colors")
    public ApiResponse<ExteriorColorResponse> getExteriorColors(
            @RequestParam("trimId") Long trimId,
            @RequestParam("interiorColorId") Long interiorColorId) {
        ExteriorColorResponse exteriorColorResponse =
                colorService.findExteriorColors(trimId, interiorColorId);
        return new ApiResponse<>(exteriorColorResponse);
    }

    @GetMapping("/interior-colors")
    public ApiResponse<InteriorColorResponse> getInteriorColors(
            @RequestParam("trimId") Long trimId,
            @RequestParam("exteriorColorId") Long exteriorColorId) {
        InteriorColorResponse interiorColorResponse =
                colorService.findInteriorColors(trimId, exteriorColorId);
        return new ApiResponse<>(interiorColorResponse);
    }

    @GetMapping("/trim-colors")
    public ApiResponse<AllColorResponse> getAllColors(@RequestParam("trimId") Long trimId) {
        AllColorResponse allColorResponse = colorService.findAllColors(trimId);
        return new ApiResponse<>(allColorResponse);
    }

    @PostMapping("/exterior-colors/activity-log/{exterior-color-id}")
    public ApiResponse<Boolean> userClickedExteriorColorLog(
            @PathVariable("exterior-color-id") Long exteriorColorId) {
        return new ApiResponse<>(colorService.userClickedExteriorColorLog(exteriorColorId));
    }

    @PostMapping("/interior-colors/activity-log/{interior-color-id}")
    public ApiResponse<Boolean> userClickedInteriorColorLog(
            @PathVariable("interior-color-id") Long interiorColorId) {
        return new ApiResponse<>(colorService.userClickedInteriorColorLog(interiorColorId));
    }
}
