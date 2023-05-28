import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Animal(
    val imageId: Int,
    val name: String,
    val shortDescription: String,
    val detailedDescription: String
) : Parcelable

