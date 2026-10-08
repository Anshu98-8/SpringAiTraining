package com.CodingBrajmohan.SpringAiTraining.dto;

public record Joke(
        String text,
        String category,
        Double laughScore,
        Boolean isNSFW
) {
}
