# iamin
for Bstation

serverport = 8003

datasource = iamin

datasource user = root

datasource password =

Please run the following queries before running the project

INSERT INTO `role` (`id`, `created_at`, `updated_at`, `name`) VALUES ('1', NULL, NULL, 'user');

INSERT INTO `location` (`id`, `created_at`, `updated_at`, `location_name`) VALUES ('1', NULL, NULL, 'SYLHET');

INSERT INTO `location` (`id`, `created_at`, `updated_at`, `location_name`) VALUES ('2', NULL, NULL, 'BANDARBAN');

INSERT INTO `location` (`id`, `created_at`, `updated_at`, `location_name`) VALUES ('3', NULL, NULL, 'KHULNA');
