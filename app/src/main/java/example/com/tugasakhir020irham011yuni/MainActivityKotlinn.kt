package example.com.tugasakhir020irham011yuni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import example.com.tugasakhir020irham011yuni.entity.Menu
import example.com.tugasakhir020irham011yuni.entity.MenuAdapter
import kotlinx.android.synthetic.main.activity_main_kotlinn.*

class MainActivityKotlinn : AppCompatActivity() {

        private var menuData = mutableListOf<Any>()
        private var totalOrder = 0
        private var totalPrice = 0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main_kotlinn)

            menuData = Menu.menus.toMutableList()

            val menuAdapter = MenuAdapter(menuData)
            menuAdapter.setAddedItemListener { menuItem, position ->
                val itemCount = menuItem.count
                val menu = menuItem.copy()
                menu.count = itemCount + 1

                menuData[position] = menu
                menuAdapter.notifyItemChanged(position, menu)

                totalPrice += menu.price
                totalOrder++

                tvReviewBooking.text = String.format(getString(R.string.review_booking), totalOrder, totalPrice)
            }

            menuAdapter.setRemoveItemListener { menuItem, position ->
                val itemCount = menuItem.count
                val menu = menuItem.copy()
                menu.count = itemCount - 1

                menuData[position] = menu
                menuAdapter.notifyItemChanged(position, menu)

                totalPrice -= menu.price
                totalOrder--

                if (totalOrder > 0) {
                    tvReviewBooking.text = String.format(getString(R.string.review_booking), totalOrder, totalPrice)
                } else {
                    tvReviewBooking.text = "-"
                }
            }

            menuItem.apply {
                hasFixedSize()
                layoutManager = LinearLayoutManager(this.context)
                adapter = menuAdapter
            }
        }
    }

