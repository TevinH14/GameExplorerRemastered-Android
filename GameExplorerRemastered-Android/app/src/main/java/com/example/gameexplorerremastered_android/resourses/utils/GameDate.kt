package com.example.gameexplorerremastered_android.resourses.utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object GameDate {
    // Formatter equivalent to "yyyy-MM-dd"
    private val formatter: DateTimeFormatter =
        DateTimeFormatter.ofPattern("yyyy-MM-dd")

    /**
     * Get today's date
     *
     * Swift: GetDate() -> Date
     */
    fun getDate(): LocalDate {
        return LocalDate.now()
    }

    /**
     * Format a LocalDate as yyyy-MM-dd
     *
     * Swift: formatDateYearMonthDay(_ date: Date)
     */
    fun formatDateYearMonthDay(date: LocalDate): String {
        return date.format(formatter)
    }

    /**
     * Get the last 30 days from the given date
     *
     * Swift: getTheLast30Days(_ date: Date)
     */
    fun getTheLast30Days(date: LocalDate): Pair<String, String> {
        val thirtyDaysAgo = date.minusDays(30)

        return Pair(
            formatDateYearMonthDay(thirtyDaysAgo),
            formatDateYearMonthDay(date)
        )
    }

    /**
     * Get the next 30 days from the given date
     *
     * Swift: getTheNext30Days(_ date: Date)
     */
    fun getTheNext30Days(date: LocalDate): Pair<String, String> {
        val thirtyDaysAhead = date.plusDays(30)

        return Pair(
            formatDateYearMonthDay(date),
            formatDateYearMonthDay(thirtyDaysAhead)
        )
    }

    /**
     * Get start and end dates for the current year
     *
     * Swift: getYearDates()
     */
    fun getYearDates(): Triple<Int, String, String> {
        val today = LocalDate.now()
        val year = today.year

        val startOfYear = LocalDate.of(year, 1, 1)
        val endOfYear = LocalDate.of(year, 12, 31)

        return Triple(
            year,
            formatDateYearMonthDay(startOfYear),
            formatDateYearMonthDay(endOfYear)
        )
    }

    /**
     * Get start and end dates for last year
     *
     * Swift: getLastYearDates()
     */
    fun getLastYearDates(): Pair<String, String> {
        val lastYear = LocalDate.now().year - 1

        val start = LocalDate.of(lastYear, 1, 1)
        val end = LocalDate.of(lastYear, 12, 31)

        return Pair(
            formatDateYearMonthDay(start),
            formatDateYearMonthDay(end)
        )
    }
}