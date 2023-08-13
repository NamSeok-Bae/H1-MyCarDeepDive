package com.h1.mycardeepdive.options.mapper;

import com.h1.mycardeepdive.options.domain.Options;
import com.h1.mycardeepdive.options.domain.Packages;
import com.h1.mycardeepdive.options.ui.dto.AdditionalOptionResponse;
import com.h1.mycardeepdive.options.ui.dto.BasicOptionResponse;
import com.h1.mycardeepdive.options.ui.dto.OptionDetailResponse;
import com.h1.mycardeepdive.options.ui.dto.PackageOptionResponse;
import com.h1.mycardeepdive.tags.domain.Tags;
import java.util.List;
import java.util.stream.Collectors;

public class OptionMapper {

    public static AdditionalOptionResponse optionToAdditionalOptionResponse(
            Options option, List<Tags> tagsList) {
        return new AdditionalOptionResponse(
                option.getId(),
                option.getImgUrl(),
                option.getChooseRate(),
                option.getName(),
                option.getSummary(),
                tagsList.stream().map(Tags::getName).collect(Collectors.toList()),
                option.getBadgeName().getViewName(),
                option.getPrice());
    }

    public static PackageOptionResponse optionToPackageOptionResponse(
            Packages _packages, List<Tags> tagsList, String imgUrl) {
        return new PackageOptionResponse(
                _packages.getId(),
                imgUrl,
                _packages.getChooseRate(),
                _packages.getName(),
                _packages.getSummary(),
                tagsList.stream().map(Tags::getName).collect(Collectors.toList()),
                _packages.getBadgeName().getViewName(),
                _packages.getPrice());
    }

    public static BasicOptionResponse optionToBasicOptionResponse(
            Options options, List<Tags> tagsList) {
        return new BasicOptionResponse(
                options.getId(),
                options.getImgUrl(),
                options.getName(),
                tagsList.stream().map(Tags::getName).collect(Collectors.toList()));
    }

    public static OptionDetailResponse optionToOptionDetailResponse(
            Options options, List<Tags> tagsList) {
        return new OptionDetailResponse(
                options.getId(),
                options.getName(),
                options.getDescription(),
                tagsList.stream().map(Tags::getName).collect(Collectors.toList()),
                options.getPrice());
    }
}
