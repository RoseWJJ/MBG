package com.et.entity;

public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.id
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sname
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.deptid
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    private Integer deptid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.id
     *
     * @return the value of emp.id
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.id
     *
     * @param id the value for emp.id
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sname
     *
     * @return the value of emp.sname
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sname
     *
     * @param sname the value for emp.sname
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.deptid
     *
     * @return the value of emp.deptid
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.deptid
     *
     * @param deptid the value for emp.deptid
     *
     * @mbg.generated Wed Dec 13 15:20:31 CST 2017
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}