databaseChangeLog = {

	changeSet(author: "mquesada", id: "1") {
		createTable(tableName: "ADDRESS") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_47")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ADDRESS1", type: "VARCHAR(200)") {
				constraints(nullable: "false")
			}

			column(name: "ADDRESS2", type: "VARCHAR(200)")

			column(name: "PHONE_NUMBER1", type: "VARCHAR(18)") {
				constraints(nullable: "false")
			}

			column(name: "PHONE_NUMBER2", type: "VARCHAR(18)")

			column(name: "PHONE_NUMBER3", type: "VARCHAR(18)")
		}
	}

	changeSet(author: "mquesada", id: "2") {
		createTable(tableName: "APPOINTMENT") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_49")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DATE", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "MEASUREMENTS_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NOTES", type: "VARCHAR(2000)")

			column(name: "OBJECTIVE_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "PATIENT_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "RECOMMENDATIONS", type: "VARCHAR(2000)")

			column(name: "STATUS", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "3") {
		createTable(tableName: "DIETARY_PROGRAM") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_51")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "END_DATE", type: "DATE") {
				constraints(nullable: "false")
			}

			column(name: "PATIENT_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "START_DATE", type: "DATE") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "4") {
		createTable(tableName: "DIETARY_PROGRAM_NUTRIENT_TO_QUANTITY") {
			column(name: "NUTRIENT_TO_QUANTITY", type: "BIGINT")

			column(name: "NUTRIENT_TO_QUANTITY_IDX", type: "VARCHAR(255)")

			column(name: "NUTRIENT_TO_QUANTITY_ELT", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "5") {
		createTable(tableName: "MEASUREMENT") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_54")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(100)") {
				constraints(nullable: "false")
			}

			column(name: "UNIT", type: "VARCHAR(10)") {
				constraints(nullable: "false")
			}

			column(name: "VALUE", type: "VARCHAR(10)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "6") {
		createTable(tableName: "MEASUREMENT_SET") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_56")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ARMS_ID", type: "BIGINT")

			column(name: "BELLY_ID", type: "BIGINT")

			column(name: "BLOOD_PRESSURE_ID", type: "BIGINT")

			column(name: "BODY_MASS_INDEX_ID", type: "BIGINT")

			column(name: "CHEST_ID", type: "BIGINT")

			column(name: "FAT_ID", type: "BIGINT")

			column(name: "LEGS_ID", type: "BIGINT")

			column(name: "WAIST_ID", type: "BIGINT")

			column(name: "WEIGHT_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "7") {
		createTable(tableName: "NUTRIENT") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_58")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DESCRIPTION", type: "VARCHAR(2000)") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(100)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "8") {
		createTable(tableName: "NUTRIENT_EQUIVALENCES") {
			column(name: "EQUIVALENCES", type: "BIGINT")

			column(name: "EQUIVALENCES_IDX", type: "VARCHAR(255)")

			column(name: "EQUIVALENCES_ELT", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "9") {
		createTable(tableName: "OBJECTIVE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_61")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "COMPLETED", type: "DATE") {
				constraints(nullable: "false")
			}

			column(name: "PROPOSED", type: "DATE") {
				constraints(nullable: "false")
			}

			column(name: "TARGET_MEASUREMENTS_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "10") {
		createTable(tableName: "PATIENT_OBJECTIVE") {
			column(name: "PATIENT_OBJECTIVES_ID", type: "BIGINT")

			column(name: "OBJECTIVE_ID", type: "BIGINT")
		}
	}

	changeSet(author: "mquesada", id: "11") {
		createTable(tableName: "RECIPE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_64")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DESCRIPTION", type: "VARCHAR(5000)") {
				constraints(nullable: "false")
			}

			column(name: "DIETARY_PROGRAM_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DIFFICULTY", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "MINUTES_TO_COMPLETE", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(100)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "12") {
		createTable(tableName: "REQUEST_MAP") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_67")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "CONFIG_ATTRIBUTE", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "URL", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "13") {
		createTable(tableName: "ROLE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_71")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "AUTHORITY", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "14") {
		createTable(tableName: "USER") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "SYS_PK_75")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ACCOUNT_EXPIRED", type: "BOOLEAN") {
				constraints(nullable: "false")
			}

			column(name: "ACCOUNT_LOCKED", type: "BOOLEAN") {
				constraints(nullable: "false")
			}

			column(name: "ADDRESS_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "BIRTH_DATE", type: "DATE") {
				constraints(nullable: "false")
			}

			column(name: "EMAIL", type: "VARCHAR(100)") {
				constraints(nullable: "false")
			}

			column(name: "ENABLED", type: "BOOLEAN") {
				constraints(nullable: "false")
			}

			column(name: "FIRST_NAME", type: "VARCHAR(25)") {
				constraints(nullable: "false")
			}

			column(name: "LAST_NAME", type: "VARCHAR(25)") {
				constraints(nullable: "false")
			}

			column(name: "PASSWORD", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "PASSWORD_EXPIRED", type: "BOOLEAN") {
				constraints(nullable: "false")
			}

			column(name: "PICTURE", type: "VARBINARY(255)")

			column(name: "USERNAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "CLASS", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "INITIAL_MEASUREMENTS_ID", type: "BIGINT")

			column(name: "PHYSICIAN_ID", type: "BIGINT")

			column(name: "PROGRAM_END", type: "DATE")

			column(name: "PROGRAM_START", type: "DATE")

			column(name: "SECONDARY_PHYSICIAN_ID", type: "BIGINT")
		}
	}

	changeSet(author: "mquesada", id: "15") {
		createTable(tableName: "USER_ROLE") {
			column(name: "ROLE_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "USER_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mquesada", id: "16") {
		addPrimaryKey(columnNames: "ROLE_ID, USER_ID", constraintName: "SYS_PK_78", tableName: "USER_ROLE")
	}

	changeSet(author: "mquesada", id: "17") {
		createIndex(indexName: "SYS_IDX_SYS_CT_65_68", tableName: "REQUEST_MAP", unique: "true") {
			column(name: "URL")
		}
	}

	changeSet(author: "mquesada", id: "18") {
		createIndex(indexName: "SYS_IDX_SYS_CT_69_72", tableName: "ROLE", unique: "true") {
			column(name: "AUTHORITY")
		}
	}

	changeSet(author: "mquesada", id: "19") {
		createIndex(indexName: "SYS_IDX_SYS_CT_73_76", tableName: "USER", unique: "true") {
			column(name: "USERNAME")
		}
	}

	changeSet(author: "mquesada", id: "20") {
		addForeignKeyConstraint(baseColumnNames: "MEASUREMENTS_ID", baseTableName: "APPOINTMENT", baseTableSchemaName: "PUBLIC", constraintName: "FKA8155B9FE11241BC", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT_SET", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "21") {
		addForeignKeyConstraint(baseColumnNames: "OBJECTIVE_ID", baseTableName: "APPOINTMENT", baseTableSchemaName: "PUBLIC", constraintName: "FKA8155B9F6C9DFEA7", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "OBJECTIVE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "22") {
		addForeignKeyConstraint(baseColumnNames: "PATIENT_ID", baseTableName: "APPOINTMENT", baseTableSchemaName: "PUBLIC", constraintName: "FKA8155B9F3AC69A67", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "23") {
		addForeignKeyConstraint(baseColumnNames: "PATIENT_ID", baseTableName: "DIETARY_PROGRAM", baseTableSchemaName: "PUBLIC", constraintName: "FK15B10B393AC69A67", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "24") {
		addForeignKeyConstraint(baseColumnNames: "ARMS_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895FEED414CC", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "25") {
		addForeignKeyConstraint(baseColumnNames: "BELLY_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895F7C57BE2D", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "26") {
		addForeignKeyConstraint(baseColumnNames: "BLOOD_PRESSURE_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895FB8456699", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "27") {
		addForeignKeyConstraint(baseColumnNames: "BODY_MASS_INDEX_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895FDF4474BF", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "28") {
		addForeignKeyConstraint(baseColumnNames: "CHEST_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895F775A0F22", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "29") {
		addForeignKeyConstraint(baseColumnNames: "FAT_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895FCE74D40A", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "30") {
		addForeignKeyConstraint(baseColumnNames: "LEGS_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895F1E35137E", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "31") {
		addForeignKeyConstraint(baseColumnNames: "WAIST_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895F29795443", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "32") {
		addForeignKeyConstraint(baseColumnNames: "WEIGHT_ID", baseTableName: "MEASUREMENT_SET", baseTableSchemaName: "PUBLIC", constraintName: "FK6393895F6AA0EC4B", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "33") {
		addForeignKeyConstraint(baseColumnNames: "TARGET_MEASUREMENTS_ID", baseTableName: "OBJECTIVE", baseTableSchemaName: "PUBLIC", constraintName: "FKA736B93950E6C70E", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT_SET", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "34") {
		addForeignKeyConstraint(baseColumnNames: "OBJECTIVE_ID", baseTableName: "PATIENT_OBJECTIVE", baseTableSchemaName: "PUBLIC", constraintName: "FK4C195C7F6C9DFEA7", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "OBJECTIVE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "35") {
		addForeignKeyConstraint(baseColumnNames: "PATIENT_OBJECTIVES_ID", baseTableName: "PATIENT_OBJECTIVE", baseTableSchemaName: "PUBLIC", constraintName: "FK4C195C7F64E16B38", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "36") {
		addForeignKeyConstraint(baseColumnNames: "DIETARY_PROGRAM_ID", baseTableName: "RECIPE", baseTableSchemaName: "PUBLIC", constraintName: "FKC846558E60293E64", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "DIETARY_PROGRAM", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "37") {
		addForeignKeyConstraint(baseColumnNames: "ADDRESS_ID", baseTableName: "USER", baseTableSchemaName: "PUBLIC", constraintName: "FK36EBCBF0554007", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "ADDRESS", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "38") {
		addForeignKeyConstraint(baseColumnNames: "INITIAL_MEASUREMENTS_ID", baseTableName: "USER", baseTableSchemaName: "PUBLIC", constraintName: "FK36EBCBCFE5E6C1", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "MEASUREMENT_SET", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "39") {
		addForeignKeyConstraint(baseColumnNames: "PHYSICIAN_ID", baseTableName: "USER", baseTableSchemaName: "PUBLIC", constraintName: "FK36EBCB7DCA6D07", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "40") {
		addForeignKeyConstraint(baseColumnNames: "SECONDARY_PHYSICIAN_ID", baseTableName: "USER", baseTableSchemaName: "PUBLIC", constraintName: "FK36EBCB5E2461F2", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "41") {
		addForeignKeyConstraint(baseColumnNames: "ROLE_ID", baseTableName: "USER_ROLE", baseTableSchemaName: "PUBLIC", constraintName: "FK143BF46A5D4A5935", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "ROLE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "mquesada", id: "42") {
		addForeignKeyConstraint(baseColumnNames: "USER_ID", baseTableName: "USER_ROLE", baseTableSchemaName: "PUBLIC", constraintName: "FK143BF46A2751D15", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "ID", referencedTableName: "USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}
}
