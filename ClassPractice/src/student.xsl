<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : student.xsl
    Created on : October 17, 2013, 3:54 PM
    Author     : sol
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>student.xsl</title>
            </head>
            <body>
                <h2> Computer Science Majors</h2>
                <xsl:apply-templates select="students/student[major='CS:BS']" />
            </body>
        </html>
    </xsl:template>

<xsl:template match ="student" />
    <xsl:apply-templates select="id"/>
    <xsl:apply-templates select="lastName"/>
    <xsl:apply-templates select="firstName" />
    <xsl:apply-templates select="dateEnrolled" />
    <xsl:apply-templates select="major" />
</xsl:template>

<xsl:template match="id">
    ID = <xsl:value-of select="."/>
</xsl:template>

<xsl:template match="lastName">
    Name = <xsl:value-of select="." />,
</xsl:template>

<xsl:template match="firstName">
     <xsl:value-of select ="." />
</xsl:template>

<xsl:template match="major">
     Major = <xsl:value-of select ="." />
     ,declared in <xsl:value-of select="@catalogYear"/>
     <xsl:if-test="@catalogYear > 2008"></xsl:if-test>
     <br />
     <div style="color:red">
         Must complete the senior project course</div>
         </xsl:if>
</xsl:template>

</xsl:stylesheet>
