package com.CodingBrajmohan.SpringAiTraining.dto;



import com.CodingBrajmohan.SpringAiTraining.entity.BookingStatus;

import java.time.Instant;

public record BookingResponse(
        Long id,
        String destination,
        Instant departureTime,
        BookingStatus status) {}