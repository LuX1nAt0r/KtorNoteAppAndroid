package com.androiddevs.ktornoteapp.data.remote.requests

import java.net.IDN

data class AddOwnerRequest(
    val owner: String,
    val noteIDN: String
)
