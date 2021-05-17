package com.robcodes.kmsprimer.domain

import javax.persistence.Id
import javax.persistence.Table

@Table
data class Profile(@Id var id: Long?, var firstName: String, var lastName: String)