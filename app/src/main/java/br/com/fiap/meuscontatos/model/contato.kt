/*@Entitiy: essa anotação indica ao Room que uma entidade para a classe “Contado” deverá ser
criada no SQLite. A propriedade “table_name” indica que o nome da tabela no SQLite deverá ser “tbl_contato”.
Se “table_name” for omitido será criado uma tabela com o mesmo nome da classe.

@PrimaryKey: indica que o atributo “id” da classe “Contato” será a chave-primária da tabela. O atributo
“autoGenerate” indica que o identificador deverá ser gerado automaticamente, ou seja,
não há a necessidade de cria-lo no momento de instanciação da classe “Contato”.

@Entitiy: essa anotação indica ao Room que uma entidade para a classe “Contado” deverá ser criada no SQLite.
A propriedade “table_name” indica que o nome da tabela no SQLite deverá ser “tbl_contato”. Se “table_name”
for omitido será criado uma tabela com o mesmo nome da classe.

@ColumnInfo: essa anotação do atributo “amigo” permite a alteração de como o campo será criado na tabela no
SQLite, neste caso estamos indicando que o campo deverá se chamar “is_amigo”. Se esta anotação for omitida,
o campo terá o mesmo nome do atributo da classe.

*/


package br.com.fiap.meuscontatos.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_contato")
data class Contato(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val nome: String = "",
    val telefone: String = "",
    @ColumnInfo(name = "is_amigo") val amigo: Boolean = false
)