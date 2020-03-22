package com.example.a60160343_finalterm

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONArray
import org.json.JSONObject

/**
 * A simple [Fragment] subclass.
 */
class recycler_view : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_recycler_view, container, false)
        val myUrl = "https://api.github.com/users/hadley/orgs"
        val result: String
        val getRequest = HttpGetRequest()

        result = getRequest.execute(myUrl).get()

        val jsonString: String = result
        val json = JSONArray(jsonString)
        val jsonArray = json
        val recyclerView: RecyclerView = view.findViewById(R.id.recyLayout)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity!!.baseContext)
        recyclerView.layoutManager = layoutManager
        val adapter =
            MyRecyclerAdapter(activity!!, jsonArray)
        recyclerView.adapter = adapter
        return view
    }
}
