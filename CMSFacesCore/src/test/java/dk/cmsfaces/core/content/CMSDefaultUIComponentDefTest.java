//-----------------------------------------------------------------------------
/*
 * Copyright (C) 2011 sunepoulsen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//-----------------------------------------------------------------------------
package dk.cmsfaces.core.content;

//-----------------------------------------------------------------------------
import javax.faces.component.html.HtmlOutputText;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

//-----------------------------------------------------------------------------
/**
 *
 * @author sunepoulsen
 */
public class CMSDefaultUIComponentDefTest {
    //-------------------------------------------------------------------------
    //              Constructors
    //-------------------------------------------------------------------------
    
    public CMSDefaultUIComponentDefTest() {
    }

    //-------------------------------------------------------------------------
    //              Test methods
    //-------------------------------------------------------------------------

    /**
     * @brief Test constructors of class CMSDefaultUIComponentDef.
     */
    @Test
    public void testConstructors() {
        CMSDefaultUIComponentDef instance = new CMSDefaultUIComponentDef();
        
        assertEquals( "", instance.getComponentName() );
        assertTrue( instance.getAttributtes().isEmpty() );
    }

    /**
     * @brief Test of getComponentName/setComponentName method, of class 
     *        CMSDefaultUIComponentDef.
     */
    @Test
    public void testComponentName() {
        CMSDefaultUIComponentDef instance = new CMSDefaultUIComponentDef();
        String compName = "";
       
        try {
            compName = "java.lang.Integer";
            instance.setComponentName( compName );
            assertEquals( compName, instance.getComponentName() );
        }
        catch( ClassNotFoundException e ) {
            fail( String.format( "The component %s could not be found.\nMessage: %s", compName, e.getMessage() ) );
        }
        
        try {
            compName = "";
            instance.setComponentName( compName );
            fail( "setComponentName accepted the empty string." );
        }
        catch( ClassNotFoundException e ) {
        }

        try {
            compName = "unknown";
            instance.setComponentName( compName );
            fail( "setComponentName accepted a string to an unknown class." );
        }
        catch( ClassNotFoundException e ) {
        }

    }

    /**
     * @brief Test of getAttributtes/setAttributtes method, of class 
     *        CMSDefaultUIComponentDef.
     */
    @Test
    public void testAttributtes() {
        CMSDefaultUIComponentDef instance = new CMSDefaultUIComponentDef();
        HashMap<String, Object> map;

        map = new HashMap();
        instance.setAttributtes( map );
        assertEquals( map, instance.getAttributtes() );

        map = new HashMap();
        map.put( "rows", 25 );
        instance.setAttributtes( map );
        assertEquals( map, instance.getAttributtes() );
    }
}
