package com.robcodes.kmsprimer.repository

import com.robcodes.kmsprimer.domain.Profile
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfileRepository : ReactiveCrudRepository<Profile, Long>