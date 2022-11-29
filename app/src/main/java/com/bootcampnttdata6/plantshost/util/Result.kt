package com.bootcampnttdata6.plantshost.util

sealed class Result<out T> {
    object Loading:Result<Nothing>()
    object Finish:Result<Nothing>()
    data class Success<out T>(val data: T): Result<T>()
    data class Failure(val exception: Exception): Result<Nothing>()
}
sealed class Result<out T> {
    object Loading:Result<Nothing>()
    object Finish:Result<Nothing>()
    data class Success<out T>(val data: T): Result<T>()
    data class Failure(val exception: Exception): Result<Nothing>()
}
sealed class Result<out T> {
    object Loading:Result<Nothing>()
    object Finish:Result<Nothing>()
    data class Success<out T>(val data: T): Result<T>()
    data class Failure(val exception: Exception): Result<Nothing>()
}