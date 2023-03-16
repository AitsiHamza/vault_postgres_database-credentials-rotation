## Vault | postgres | credential rotation

#### This demo demonstrate the use of Vault's database secrets engine to dynamically manage database credentials. Vault creates a unique set of username and password with specified time-to-live (TTL) every time a client (e.g. a user or application) requests. This allows each application to have its own database credentials.

``I'm running postgres in docker, so I can't use localhost``

<img src="/resources/1.jpg">

``instead i should use local_pgdb``

<img src="/resources/img.png">

``I should disable sslmode``

<img src="/resources/img_1.png">

``I should grant these priveleges to schema public``

<img src="/resources/img_2.png">

``I will create a db with this name``

<img src="/resources/img_3.png">

``I'm running vault in docker, so i should run these commands in the terminal of vault container``

<img src="/resources/img_4.png">

``These commands are just to test if put and get of secrets are allowed``

<img src="/resources/img_5.png">

``To enable secrets database``

<img src="/resources/img_6.png">

``I should create the role my-role first``

``Grant privileges to schema public, i can also add revoke privileges``

<img src="/resources/img_7.png">

``Verify auths and my-role``

<img src="/resources/img_8.png">

``Get all products``

<img src="/resources/img_9.png">

``add products``

<img src="/resources/img_10.png">

``configs are stored``

<img src="/resources/img_11.png">

``my-role is stored``

<img src="/resources/img_12.png">

## After stopping the vault container these configs will be discarded!
