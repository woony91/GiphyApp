package com.example.giphyapp.model


import com.google.gson.annotations.SerializedName


data class Meta(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("response_id")
	val responseId: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)