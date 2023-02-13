package git.myapplication.toyphotogallery.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import git.myapplication.toyphotogallery.Home.HomeViewPager
import git.myapplication.toyphotogallery.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)





        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    class CustomPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
        private val PAGENUMBER = 4

        override fun getCount(): Int {
            return PAGENUMBER
        }

        override fun getItem(position: Int): Fragment {
            return when (position){
                0 -> HomeViewPager.newInstance(R.raw.img00)
                1 -> HomeViewPager.newInstance(R.raw.img01)
                2 -> HomeViewPager.newInstance(R.raw.img02)
                3 -> HomeViewPager.newInstance(R.raw.img03)
                else -> HomeViewPager.newInstance(R.raw.img00)

            }
        }
    }


}