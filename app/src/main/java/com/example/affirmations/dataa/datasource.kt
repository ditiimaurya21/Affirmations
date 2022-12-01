package com.example.affirmations.dataa

import com.example.affirmations.R
import com.example.affirmations.modell.Affs


class Datasource {
    fun loadAffs():List<Affs>{
        return listOf<Affs>(
            Affs(R.string.aff1, R.drawable.img1),
            Affs(R.string.aff2, R.drawable.img2),
            Affs(R.string.aff3, R.drawable.img3),
            Affs(R.string.aff4, R.drawable.img4),
            Affs(R.string.aff5, R.drawable.img5),
            Affs(R.string.aff6, R.drawable.img6),
            Affs(R.string.aff7, R.drawable.img7),
            Affs(R.string.aff8, R.drawable.img8),
            Affs(R.string.aff9,R.drawable.img9),
            Affs(R.string.aff10,R.drawable.img10),
            Affs(R.string.aff11,R.drawable.img11),
            Affs(R.string.aff12, R.drawable.img12),
            Affs(R.string.aff13, R.drawable.img13),
            Affs(R.string.aff14, R.drawable.img14),
            Affs(R.string.aff15, R.drawable.img15)
        )
    }
}