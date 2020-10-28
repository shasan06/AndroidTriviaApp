package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
        return  binding.root

    }

}

/**
 *Answer these questions
Question 1
What are some of the differences between fragments and activities? Select all the statements that are true.
•	When creating a fragment, you inflate the layout in the onCreateView() method. When creating an activity, you inflate the layout in onCreate().
•	An activity has its own layout, but a fragment cannot have its own layout.
•	An activity has its own lifecycle, but a fragment doesn't.
•	When inflating the layout for either a fragment or an activity, you can reference the layout as R.layout.layoutname.

Answer 1)	The first one is true that is:

•	 When creating a fragment, you inflate the layout in the onCreateView() method. When creating an activity, you inflate the layout in onCreate().

Question 2
Which of the following statements about fragments are true? Select all that apply.
•	You can use a fragment in more than one activity.
•	One activity can have multiple fragments.
•	After you define a fragment in a Kotlin class, the fragment is automatically added to the activity_main.xml layout file.
•	Use the <fragment> tag to define the place in a layout file where a fragment is to be inserted.

Answer 2) The first, second and fourth one is True that is:
•	You can use a fragment in more than one activity.
•	One activity can have multiple fragments.
•	Use the <fragment> tag to define the place in a layout file where a fragment is to be inserted.

 */