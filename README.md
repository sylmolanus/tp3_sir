# tp3_sir
Rappels:
-Les "tables" d'une base de données relationnelle (BDR) correspondent à des "collections" en BDOD.
-Une collection peut accueillir plusieurs structures de données différentes (une entrée = un "document").

Limites d’une base données orientées document ?
- Avec une BDR classique, une fois la structure créée, il est seulement possible d'ajouter des données qui correspondent à la structure      de la base. Avec une BDOD, le développeur peut facilement insérer n'importe quel type de données dans n'importe quelle collection, ce qui implique un gros risque d'avoir des structures de documents inconsistentes ou obsolètes avec de nombreuses mises à jour.
- La quantité est limitée pour stocker un gros nombre de données dans des documents. Et plus on stocke de données dans la BDD, plus la taille du document augmente.
# [tp3_sir_redis](https://github.com/lewanni/tp3.sir.redis)
Redis est une base de données open source de type clefs-valeurs mono-threadée.
- Quelles sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ?
  - Elle accueille les données structurées suivantes : des chaînes de caractères, des listes, des hashs, des sets, des sets triés, des bitmaps, des hyperloglogs
  - Chaque structure de données gérée possède des caractéristiques uniques et commandes uniques. Avec jedis, on petu faire des requêtes du type get, set, incr et d'autres.

Que peut on faire comme types de requêtes ?

Chaque structure de données gérée possède des caractéristiques uniques et commandes uniques. Il est impossible de requêter les valeurs comme on le fait habituellement avec un WHERE dans une BDR, une valeur en table n'est accessible que via une clé. Alors qu'une clé est stockée comme un tableau de bytes, on utilise essentiellement une string come clé.
