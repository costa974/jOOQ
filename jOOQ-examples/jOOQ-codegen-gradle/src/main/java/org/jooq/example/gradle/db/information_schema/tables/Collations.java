/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Collations extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord> {

	private static final long serialVersionUID = 1916873339;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.COLLATIONS</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Collations COLLATIONS = new org.jooq.example.gradle.db.information_schema.tables.Collations();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.COLLATIONS.NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLLATIONS.KEY</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord, java.lang.String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
	 */
	public Collations() {
		this("COLLATIONS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
	 */
	public Collations(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Collations.COLLATIONS);
	}

	private Collations(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Collations(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.CollationsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Collations as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Collations(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Collations rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Collations(name, null);
	}
}