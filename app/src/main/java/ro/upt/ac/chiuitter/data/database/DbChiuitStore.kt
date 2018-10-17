package ro.upt.ac.chiuitter.data.database

import ro.upt.ac.chiuitter.data.ChiuitRepository
import ro.upt.ac.chiuitter.domain.Chiuit

class DbChiuitStore(private val appDatabase: AppDatabase) : ChiuitRepository {

    override fun getAll(): List<Chiuit> {
        return appDatabase.chiuitDao().getAll().map { it.toDomainModel() }
    }

    override fun addChiuit(chiuit: Chiuit) {
        TODO ("Insert the new entry")
    }

    override fun removeChiuit(chiuit: Chiuit) {
        TODO ("Insert the specified entry")
    }


    private fun Chiuit.toDbModel() = ChiuitEntity(timestamp, description)

    private fun ChiuitEntity.toDomainModel() = Chiuit(timestamp, description)

}