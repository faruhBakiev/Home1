package com.excample.home1.repository

import com.excample.home1.model.MainModel

class RecyclerRepository {

    private val listData = arrayListOf<MainModel>()

    fun getListModelData(): ArrayList<MainModel> {
        listData.add(
            MainModel(
                "Криштиану Роналду",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Cristiano_Ronaldo_2018.jpg/233px-Cristiano_Ronaldo_2018.jpg"
            )
        )
        listData.add(
            MainModel(
                "Лионель Месси",
                "https://uznayvse.ru/images/catalog/2022/2/lionel-messi_87.jpg"
            )
        )
        listData.add(
            MainModel(
                "Неймар",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg/280px-20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg"
            )
        )
        listData.add(
            MainModel(
                "Гарет Бейл",
                "https://90l.tribuna.com/images/fd/55/8b/fd558bdf86284a94a7afc9f56e560911500x500@2x.jpg"
            )
        )
        listData.add(
            MainModel(
                "Килиан Мбаппе",
                "https://img.championat.com/c/1200x900/news/big/r/w/kilian-mbappe-sovsem-obnaglel_1665563070403100590.jpg"
            )
        )
        return listData
    }
}
