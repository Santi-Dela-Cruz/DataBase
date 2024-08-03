-- database: ../dataBase/ExaBot2k24.sqlite
INSERT INTO
    CATALOGOTIPO (NOMBRE, DESCRIPCION)
VALUES
    ('Tipo de persona', 'Tipo de persona sol, mec,...'),
    ('Sexo', 'Tipo de sexo mas, fem,...'),
    (
        'Estado civil',
        'Tipo de estado civil sol, cas,...'
    ),
    ('Etnia', 'Tipo de etnia mes, neg,...');

INSERT INTO
    CATALOGO (IDCATALOGOTIPO, NOMBRE, DESCRIPCION)
VALUES
    (
        '1',
        'Soldado',
        'Tipos de personas para el ejercito'
    ) -- 1
,
    (
        '1',
        'Mecanico',
        'Tipos de personas para el ejercito'
    ) -- 2
,
    (
        '1',
        'Experto Ingles',
        'Tipos de personas para el ejercito'
    ) -- 3
,
    (
        '1',
        'Experto Español',
        'Tipos de personas para el ejercito'
    ) -- 4
,
    (
        '2',
        'Masculino',
        'Tipos de sexos para una persona'
    ) -- 5
,
    (
        '2',
        'Femenino',
        'Tipos de sexos para una persona'
    ) -- 6
,
    ('2', 'Hibrido', 'Tipos de sexos para una persona') -- 7
,
    ('2', 'Asexual', 'Tipos de sexos para una persona') -- 8
,
    (
        '3',
        'Soltero',
        'Tipos de estados civiles para una persona'
    ) -- 9
,
    (
        '3',
        'Casado',
        'Tipos de estados civiles para una persona'
    ) -- 10
,
    (
        '3',
        'Viudo',
        'Tipos de estados civiles para una persona'
    ) -- 11
,
    (
        '3',
        'Divorciado',
        'Tipos de estados civiles para una persona'
    ) -- 12
,
    ('4', 'Blanco', 'Tipos de etnias para una persona') -- 13
,
    ('4', 'Negro', 'Tipos de etnias para una persona') -- 14
,
    (
        '4',
        'Mestizo',
        'Tipos de etnias para una persona'
    ) -- 15
,
    (
        '4',
        'Indigena',
        'Tipos de etnias para una persona'
    ) -- 16
;

INSERT INTO
    IABOT (NOMBRE, OBSERVACION)
VALUES
    ('IA-RUSO', 'INTELIGENCIA ARTIFICIAL');

INSERT INTO
    EXABOT (IDIABOT, NOMBRE, SERIE)
VALUES
    ('1', 'EXABOT1', 'SERIE1'),
    ('1', 'EXABOT2', 'SERIE2');

INSERT INTO
    PERSONA (
        IDCATALOGOTIPOPERSONA,
        IDCATALOGOSEXO,
        IDCATALOGOESTADOCIVIL,
        CEDULA,
        NOMBRE,
        APELLIDO
    )
VALUES
    ('1', '5', '9', '111', 'Pepe', 'Lopez'),
    ('2', '6', '10', '222', 'Maria', 'Lugmana'),
    ('3', '7', '11', '333', 'Guille', 'Cruz'),
    ('4', '8', '12', '444', 'Chema', 'Real'),
    ('1', '5', '9', '555', 'Loto', 'Torres'),
    ('2', '6', '10', '666', 'Eli', 'Pacha'),
    ('3', '7', '11', '777', 'Robert', 'Guaman'),
    ('4', '8', '12', '888', 'Martin', 'Cannar');
