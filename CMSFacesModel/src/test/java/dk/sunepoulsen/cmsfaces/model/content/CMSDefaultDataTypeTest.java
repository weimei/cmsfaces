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
package dk.sunepoulsen.cmsfaces.model.content;

//-----------------------------------------------------------------------------
import org.junit.Test;
import static org.junit.Assert.*;

//-----------------------------------------------------------------------------
/**
 *
 * @author sunepoulsen
 */
public class CMSDefaultDataTypeTest {
    
    public CMSDefaultDataTypeTest() {
    }

    /**
     * Test of getId/setId method, of class CMSDefaultDataType.
     */
    @Test
    public void testId() {
        CMSDefaultDataType instance = new CMSDefaultDataType();
        
        instance.setId( "name" );
        assertEquals( "name", instance.getId() );
        
        try {
            instance.setId( "" );
            fail( "setId accepted the empty string." );
        }
        catch( IllegalArgumentException e ) {          
        };
        
        try {
            instance.setId( "id with space" );
            fail( "setId accepted an id with space." );
        }
        catch( IllegalArgumentException e ) {          
        };
    }

    /**
     * Test of getName/setName method, of class CMSDefaultDataType.
     */
    @Test
    public void testName() {
        CMSDefaultDataType instance = new CMSDefaultDataType();
        
        instance.setName( "" );
        assertEquals( "", instance.getName() );        
        instance.setName( "name" );
        assertEquals( "name", instance.getName() );        
        instance.setName( "name with space" );
        assertEquals( "name with space", instance.getName() );        
    }

    /**
     * Test of getLabel/setLabel method, of class CMSDefaultDataType.
     */
    @Test
    public void testLabel() {
        CMSDefaultDataType instance = new CMSDefaultDataType();
        
        instance.setLabel( "" );
        assertEquals( "", instance.getLabel() );        
        instance.setLabel( "label" );
        assertEquals( "label", instance.getLabel() );        
        instance.setLabel( "label with space" );
        assertEquals( "label with space", instance.getLabel() );
    }

    /**
     * Test of getDescription/setDescription method, of class CMSDefaultDataType.
     */
    @Test
    public void testDescription() {
        CMSDefaultDataType instance = new CMSDefaultDataType();
        
        instance.setDescription( "" );
        assertEquals( "", instance.getDescription() );        
        instance.setDescription( "Description" );
        assertEquals( "Description", instance.getDescription() );        
        instance.setDescription( "Description with space" );
        assertEquals( "Description with space", instance.getDescription() );
    }

    /**
     * Test of getCompatibleClass/setCompatibleClass method, of class CMSDefaultDataType.
     */
    @Test
    public void testCompatibleClass() {
        CMSDefaultDataType instance = new CMSDefaultDataType();
        
        instance.setCompatibleClass( Integer.class );
        assertEquals( Integer.class, instance.getCompatibleClass() );        
    }

    /**
     * Test of isCompatible method, of class CMSDefaultDataType.
     */
    @Test
    public void testIsCompatible() {
        CMSDefaultDataType instance = new CMSDefaultDataType();
        
        instance.setCompatibleClass( null );
        assertEquals( true, instance.isCompatible( null ) );        
        assertEquals( false, instance.isCompatible( new Integer(7) ) );        

        instance.setCompatibleClass( Integer.class );
        assertEquals( false, instance.isCompatible( null ) );        
        assertEquals( true, instance.isCompatible( new Integer(7) ) );        
        assertEquals( false, instance.isCompatible( false ) );        
        assertEquals( false, instance.isCompatible( instance ) );        
    }
}
