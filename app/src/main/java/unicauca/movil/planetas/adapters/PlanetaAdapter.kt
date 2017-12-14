package unicauca.movil.planetas.adapters

import android.databinding.DataBindingUtil
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import unicauca.movil.planetas.R
import unicauca.movil.planetas.databinding.TemplatePlanetaBinding
import unicauca.movil.planetas.models.Destino
import unicauca.movil.planetas.util.inflate

class PlanetaAdapter : BaseAdapter() {

    var data: List<Destino> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getCount(): Int = data.size

    override fun getItem(position: Int): Any = data[position]

    override fun getItemId(position: Int): Long =  position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val v: View = convertView ?: parent.inflate(R.layout.template_planeta)
        val binding:TemplatePlanetaBinding = DataBindingUtil.bind(v)
        binding.destino = data[position]
        return binding.root
    }

}
