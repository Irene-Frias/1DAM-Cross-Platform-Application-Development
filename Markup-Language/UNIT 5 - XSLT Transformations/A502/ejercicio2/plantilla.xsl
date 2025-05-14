<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <meta lang="es"></meta>
                <meta charset="UTF-8"></meta>
                <meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
                <meta name="description" content="width-device-view-port"></meta>
                <meta http-equiv="X-UA-Compatible" content="ie=edge"></meta>
                <link rel="stylesheet" href="estilos/estilo.css"></link>
                <title>plantilla.xsl</title>
            </head>
            <body>
                <header>
                    <h1><xsl:value-of select="tienda/nombre"/> 
                    (<xsl:value-of select="tienda/telefono"/>)</h1>               
                    <h3>Listado de articulos</h3>
                </header>
                
                <br/>
                
                <ul>
                    <xsl:for-each select="tienda/producto">
                        <li class="negrita"><xsl:value-of select="articulo"/></li>
                    </xsl:for-each>
                </ul>
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>