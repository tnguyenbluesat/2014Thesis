stk.v.10.0
WrittenBy    STK_v10.0.2
BEGIN Scenario
    Name            US_greatcircle_12sat_400km

BEGIN Epoch

    Epoch        3 Dec 2013 01:00:00.000000000
    SmartEpoch
	BEGIN	EVENT
			Epoch	3 Dec 2013 01:00:00.000000000
			EventEpoch
				BEGIN	EVENT
					Type	EVENT_LINKTO
					Name	AnalysisStartTime
				END	EVENT
			EpochState	Implicit
	END	EVENT


END Epoch

BEGIN Interval

Start                   3 Dec 2013 01:00:00.000000000
Stop                    25 Feb 2014 13:00:00.000000000
    SmartInterval
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

EpochUsesAnalStart      No
AnimStartUsesAnalStart  Yes
AnimStopUsesAnalStop    Yes

END Interval

BEGIN EOPFile

    EOPFilename     EOP-v1.1.txt

END EOPFile

BEGIN GlobalPrefs

    SatelliteNoOrbWarning    No
    MissilePerigeeWarning    No
    MissileStopTimeWarning   No
    AircraftWGS84Warning     Always
END GlobalPrefs

BEGIN CentralBody

    PrimaryBody     Earth

END CentralBody

BEGIN CentralBodyTerrain

END CentralBodyTerrain

BEGIN StarCollection

    Name     Hipparcos 2 Mag 6

END StarCollection

BEGIN ScenarioLicenses
    Module    AMMv10.0
    Module    ASTGv10.0
    Module    AnalysisWBv10.0
    Module    CATv10.0
    Module    COVv10.0
    Module    Commv10.0
    Module    Radarv10.0
    Module    SEETv10.0
    Module    STKIntegrationv10.0
    Module    STKProfessionalv10.0
    Module    STKv10.0
    Module    SatProv10.0
    Module    UPropv10.0
END ScenarioLicenses

BEGIN WebData
        EnableWebTerrainData    No
        SaveWebTerrainDataPasswords    No
        BEGIN ConfigServerDataList
            BEGIN ConfigServerData
                Name "globeserver.agi.com"
                Port 80
                DataURL "bin/getGlobeSvrConfig.pl"
            END ConfigServerData
        END ConfigServerDataList
END WebData

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Animation

    StartTime          3 Dec 2013 01:00:00.000000000
    EndTime            25 Feb 2014 13:00:00.000000000
    CurrentTime        6 Dec 2013 06:52:40.000000000
    Direction          Forward
    UpdateDelta        10.000000
    RefreshDelta       0.010000
    XRealTimeMult      1.000000
    RealTimeOffset     0.000000
    XRtStartFromPause  Yes

END Animation


        BEGIN DisplayFlags
            ShowLabels           On
            ShowPassLabel        Off
            ShowElsetNum         Off
            ShowGndTracks        On
            ShowGndMarkers       On
            ShowOrbitMarkers     On
            ShowPlanetOrbits     Off
            ShowPlanetCBIPos     On
            ShowPlanetCBILabel   On
            ShowPlanetGndPos     On
            ShowPlanetGndLabel   On
            ShowSensors          On
            ShowWayptMarkers     Off
            ShowWayptTurnMarkers Off
            ShowOrbits           On
            ShowDtedRegions      Off
            ShowAreaTgtCentroids On
            ShowToolBar          On
            ShowStatusBar        On
            ShowScrollBars       On
            AllowAnimUpdate      On
            AccShowLine          On
            AccAnimHigh          On
            AccStatHigh          On
            ShowPrintButton      On
            ShowAnimButtons      On
            ShowAnimModeButtons  On
            ShowZoomMsrButtons   On
            ShowMapCbButton      Off
        END DisplayFlags

BEGIN WinFonts

    System
    MS Sans Serif,22,0,0
    MS Sans Serif,28,0,0

END WinFonts

BEGIN MapData

    Begin TerrainConverterData
           NorthLat        0.00000000000000e+000
           EastLon         0.00000000000000e+000
           SouthLat        0.00000000000000e+000
           WestLon         0.00000000000000e+000
           ColorByRGB      No
           AltsFromMSL     No
           UseColorRamp    Yes
           UseRegionMinMax Yes
           SizeSameAsSrc   Yes
           MinAltHSV       0.00000000000000e+000 7.00000000000000e-001 8.00000000000000e-001 4.00000000000000e-001
           MaxAltHSV       1.00000000000000e+006 0.00000000000000e+000 2.00000000000000e-001 1.00000000000000e+000
           SmoothColors    Yes
           CreateChunkTrn  No
           OutputFormat    PDTTX
    End TerrainConverterData

    DisableDefKbdActions     Off
    TextShadowStyle          Dark
    TextShadowColor          #000000
    BingLevelOfDetailScale   2.000000
    BEGIN Map
        MapNum         1
        TrackingMode   LatLon
        PickEnabled    On
        PanEnabled     On

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      -122.739160
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground Off
            BingType             HillShade
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    -122.739160
                    ZoomWidth    360.000000
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN DisplayFlags
            ShowLabels           On
            ShowPassLabel        Off
            ShowElsetNum         Off
            ShowGndTracks        On
            ShowGndMarkers       On
            ShowOrbitMarkers     On
            ShowPlanetOrbits     Off
            ShowPlanetCBIPos     On
            ShowPlanetCBILabel   On
            ShowPlanetGndPos     On
            ShowPlanetGndLabel   On
            ShowSensors          On
            ShowWayptMarkers     Off
            ShowWayptTurnMarkers Off
            ShowOrbits           On
            ShowDtedRegions      Off
            ShowAreaTgtCentroids On
            ShowToolBar          On
            ShowStatusBar        On
            ShowScrollBars       On
            AllowAnimUpdate      Off
            AccShowLine          On
            AccAnimHigh          On
            AccStatHigh          On
            ShowPrintButton      On
            ShowAnimButtons      On
            ShowAnimModeButtons  On
            ShowZoomMsrButtons   On
            ShowMapCbButton      Off
        END DisplayFlags

        BEGIN SoftVTR
            OutputFormat     WMV
            Directory        C:\Users\Thien Nguyen\Dropbox\Thesis\STK\TestRuns\
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData
    END Map

    BEGIN MapStyles

        UseStyleTime        No

        BEGIN Style
        Name                DefaultWithBing
        Time                0.000000
        UpdateDelta         60.000000

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      0.000000
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground On
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    0.000000
                    ZoomWidth    359.999998
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN SoftVTR
            OutputFormat     WMV
            Directory        C:\Users\Thien Nguyen\Documents\STK 10
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData

        ShowDtedRegions     Off

        End Style

        BEGIN Style
        Name                DefaultWithoutBing
        Time                0.000000
        UpdateDelta         60.000000

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      0.000000
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground Off
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    0.000000
                    ZoomWidth    359.999998
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN SoftVTR
            OutputFormat     WMV
            Directory        C:\Users\Thien Nguyen\Documents\STK 10
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData

        ShowDtedRegions     Off

        End Style

    END MapStyles

END MapData

        BEGIN GfxClassPref

        END GfxClassPref


        BEGIN ConnectGraphicsOptions

            AsyncPickReturnUnique          OFF

        END ConnectGraphicsOptions

    END Graphics
    
    BEGIN Overlays
    END Overlays
    
    BEGIN Broker
    END Broker
    
    BEGIN ClsApp
		RangeConstraint         5000.000
		ApoPeriPad              30000.000
		OrbitPathPad            100000.000
		TimeDistPad             30000.000
		OutOfDate               2592000.000
		MaxApoPeriStep          900.000
		ApoPeriAngle            0.785
		UseApogeePerigeeFilter  Yes
		UsePathFilter           No
		UseTimeFilter           No
		UseOutOfDate            Yes
		CreateSats              No
		MaxSatsToCreate         500
		UseModelScale           No
		ModelScale              0.000
		UseCrossRefDb           Yes
		CollisionDB                     stkAllTLE.tce
		CollisionCrossRefDB             stkAllTLE.sd
		ShowLine                Yes
		AnimHighlight           Yes
		StaticHighlight         Yes
		UseLaunchWindow                         No
		LaunchWindowUseEntireTraj               Yes
		LaunchWindowTrajMETStart                0.000
		LaunchWindowTrajMETStop                 900.000
		LaunchWindowStart                       0.000
		LaunchWindowStop                        -7214400.000
		LaunchMETOffset                         0.000
		LaunchWindowUseSecEphem                 No 
		LaunchWindowUseScenFolderForSecEphem    Yes
		LaunchWindowUsePrimEphem                No 
		LaunchWindowUseScenFolderForPrimEphem   Yes
    LaunchWindowIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	4 Dec 2013 01:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

		LaunchWindowUsePrimMTO                  No 
		GroupLaunches                           No 
		LWTimeConvergence                       1.000e-003
		LWRelValueConvergence                   1.000e-008
		LWTSRTimeConvergence                    1.000e-004
		LWTSRRelValueConvergence                1.000e-010
		LaunchWindowStep                        300.000
		MaxTSRStep                              180.000
		MaxTSRRelMotion                         20.000
		UseLaunchArea                           No 
		LaunchAreaOrientation                   North
		LaunchAreaAzimuth                       0.000
		LaunchAreaXLimits                       -10000.000   10000.000
		LaunchAreaYLimits                       -10000.000   10000.000
		LaunchAreaNumXIntrPnts                  1
		LaunchAreaNumYIntrPnts                  1
		LaunchAreaAltReference                  Ellipsoid
		TargetSameStop                          No 
		SkipSurfaceMetric                       No 
		LWAreaTSRRelValueConvergence            1.000e-010
		AreaLaunchWindowStep                    300.000
		AreaMaxTSRStep                          30.000
		AreaMaxTSRRelMotion                     1.000
		ShowLaunchArea                          No 
		ShowBlackoutTracks                      No 
		BlackoutColor                           #ff0000
		ShowClearedTracks                       No 
		UseObjectForClearedColor                No 
		ClearedColor                             #ffffff
		ShowTracksSegments                      Yes
		ShowMinRangeTracks                      Yes
		MinRangeTrackTimeStep                   0.500000
		UsePrimStepForTracks                    Yes
		GfxTracksTimeStep                       30.000
		GfxAreaNumXIntrPnts                     1
		GfxAreaNumYIntrPnts                     1
		CreateLaunchMTO                         No 
		CovarianceSigmaScale                    3.000
		CovarianceMode                          None 
    END ClsApp
    
    BEGIN Units
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		MissionModelerDistanceUnit		NauticalMiles
		MissionModelerTimeUnit		Hours
		MissionModelerAltitudeUnit		Feet
		MissionModelerFuelQuantityUnit		Pounds
		MissionModelerRunwayLengthUnit		Kilofeet
		MissionModelerBearingAngleUnit		Degrees
		MissionModelerAngleOfAttackUnit		Degrees
		MissionModelerAttitudeAngleUnit		Degrees
		MissionModelerGUnit		StandardSeaLevelG
		SolidAngle		Steradians
		MissionModelerTSFCUnit		TSFCLbmHrLbf
		MissionModelerPSFCUnit		PSFCLbmHrHp
		MissionModelerForceUnit		Pounds
		MissionModelerPowerUnit		Horsepower
		SpectralBandwidthUnit		Hertz
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END Units
    
    BEGIN ReportUnits
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		MissionModelerDistanceUnit		NauticalMiles
		MissionModelerTimeUnit		Hours
		MissionModelerAltitudeUnit		Feet
		MissionModelerFuelQuantityUnit		Pounds
		MissionModelerRunwayLengthUnit		Kilofeet
		MissionModelerBearingAngleUnit		Degrees
		MissionModelerAngleOfAttackUnit		Degrees
		MissionModelerAttitudeAngleUnit		Degrees
		MissionModelerGUnit		StandardSeaLevelG
		SolidAngle		Steradians
		MissionModelerTSFCUnit		TSFCLbmHrLbf
		MissionModelerPSFCUnit		PSFCLbmHrHp
		MissionModelerForceUnit		Pounds
		MissionModelerPowerUnit		Horsepower
		SpectralBandwidthUnit		Hertz
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END ReportUnits
    
    BEGIN ConnectReportUnits
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		MissionModelerDistanceUnit		NauticalMiles
		MissionModelerTimeUnit		Hours
		MissionModelerAltitudeUnit		Feet
		MissionModelerFuelQuantityUnit		Pounds
		MissionModelerRunwayLengthUnit		Kilofeet
		MissionModelerBearingAngleUnit		Degrees
		MissionModelerAngleOfAttackUnit		Degrees
		MissionModelerAttitudeAngleUnit		Degrees
		MissionModelerGUnit		StandardSeaLevelG
		SolidAngle		Steradians
		MissionModelerTSFCUnit		TSFCLbmHrLbf
		MissionModelerPSFCUnit		PSFCLbmHrHp
		MissionModelerForceUnit		Pounds
		MissionModelerPowerUnit		Horsepower
		SpectralBandwidthUnit		Hertz
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END ConnectReportUnits
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN GenDb

		BEGIN Database
		    DbType       Satellite
		    DefDb        stkAllTLE.sd
		    UseMyDb      Off
		    MyDb         .\stkSatDb.sd
		    MaxMatches   2000

		END Database

		BEGIN Database
		    DbType       City
		    DefDb        stkCityDb.cd
		    UseMyDb      Off
		    MyDb         \
		    MaxMatches   2000

		END Database

		BEGIN Database
		    DbType       Facility
		    DefDb        stkFacility.fd
		    UseMyDb      Off
		    MyDb         .\stkFacility.fd
		    MaxMatches   2000

		END Database
    END GenDb
    
    BEGIN Msgp4Ext
    END Msgp4Ext
    
    BEGIN FileLocations
    END FileLocations
    
    BEGIN Author
	Optimize	No
	UseBasicGlobe	No
	SaveEphemeris	Yes
	SaveScenFolder	No
	BEGIN ExternalFileTypes
	    BEGIN Type
		FileType  Calculation Scalar
		Include    No
	    END Type
	    BEGIN Type
		FileType  Celestial Image
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Cloud
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  EOP
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Globe
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Globe Data
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Map
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Map Image
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Marker/Label
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Model
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Object Break-up File
		Include    No
	    END Type
	    BEGIN Type
		FileType  Planetary Ephemeris
		Include    No
	    END Type
	    BEGIN Type
		FileType  Report Style Script
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Report/Graph Style
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Scalar Calculation File
		Include    No
	    END Type
	    BEGIN Type
		FileType  Terrain
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Volumetric File
		Include    No
	    END Type
	    BEGIN Type
		FileType  WTM
		Include    Yes
	    END Type
	END ExternalFileTypes
	ReadOnly	No
	ViewerPassword	No
	STKPassword	No
	ExcludeInstallFiles	No
	BEGIN ExternalFileList
	END ExternalFileList
    END Author
    
    BEGIN ExportDataFile
    FileType         Ephemeris
    IntervalType    Ephemeris
    TimePeriodStart  0.000000e+000
    TimePeriodStop   0.000000e+000
    StepType         Ephemeris
    StepSize         60.000000
    EphemType        STK
    UseVehicleCentralBody   Yes
    CentralBody      Earth
    SatelliteID      -200000
    CoordSys         ICRF
    NonSatCoordSys   Fixed
    InterpolateBoundaries  Yes
    EphemFormat      Current
    InterpType       9
    InterpOrder      5
    AttCoordSys      Fixed
    Quaternions      0
    ExportCovar      Position
    AttitudeFormat   Current
    TimePrecision      6
    CCSDSDateFormat    YMD
    CCSDSEphFormat     SciNotation
    CCSDSTimeSystem    UTC
    CCSDSRefFrame      ICRF
    UseSatCenterAndFrame   No
    END ExportDataFile
    
    BEGIN Desc
    END Desc
    
    BEGIN RfEnv
<!-- STKv4.0 Format="XML" -->
<STKOBJECT>
<OBJECT Class = "RFEnvironment" Name = "STK_RF_Environment">
    <OBJECT Class = "link" Name = "ActiveCommSystem">
        <OBJECT Class = "string" Name = ""> &quot;None&quot; </OBJECT>
    </OBJECT>
    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
    <OBJECT Class = "string" Name = "Description"> &quot;STK RF Environment&quot; </OBJECT>
    <OBJECT Class = "double" Name = "EarthTemperature"> 290 K </OBJECT>
    <OBJECT Class = "link" Name = "PropagationChannel">
        <OBJECT Class = "PropagationChannel" Name = "RF_Propagation_Channel">
            <OBJECT Class = "link" Name = "AtmosAbsorptionModel">
                <OBJECT Class = "AtmosphericAbsorptionModel" Name = "Simple_Satcom">
                    <OBJECT Class = "string" Name = "Category"> &quot;@Top&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;Simple Satcom gaseous absorption model&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "double" Name = "SurfaceTemperature"> 293.15 K </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;Simple Satcom&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;Simple Satcom gaseous absorption model&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "WaterVaporConcentration"> 7.5 g*m^-3 </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
            <OBJECT Class = "link" Name = "CloudFogModel">
                <OBJECT Class = "CloudFogLossModel" Name = "ITU_840-3">
                    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "double" Name = "CloudCeiling"> 3000 m </OBJECT>
                    <OBJECT Class = "double" Name = "CloudLayerThickness"> 500 m </OBJECT>
                    <OBJECT Class = "double" Name = "CloudLiqWaterDensity"> 7.5 g*m^-3 </OBJECT>
                    <OBJECT Class = "double" Name = "CloudTemp"> 273.15 K </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;ITU 840-3&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;ITU 840-3&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;ITU 840-3&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "Description"> &quot;RF Propagation Channel&quot; </OBJECT>
            <OBJECT Class = "link" Name = "RainModel">
                <OBJECT Class = "RainLossModel" Name = "ITU-R_P618-10">
                    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;ITU-R P618-10 rain model&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "double" Name = "SurfaceTemperature"> 273.15 K </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;ITU-R P618-10&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;ITU-R P618-10 rain model&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
            <OBJECT Class = "link" Name = "TropoScintModel">
                <OBJECT Class = "TropoScintLossModel" Name = "ITU_618-8_Scintillation">
                    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "bool" Name = "ComputeDeepFade"> False </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;ITU 618-8 Scintillation&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "FadeOutage"> 0.001 unitValue </OBJECT>
                    <OBJECT Class = "double" Name = "PercentTimeRefracGrad"> 0.1 unitValue </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "double" Name = "SurfaceTemperature"> 273.15 K </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;ITU 618-8 Scintillation&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;ITU 618-8 Scintillation&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "Type"> &quot;RF Propagation Channel&quot; </OBJECT>
            <OBJECT Class = "link" Name = "UrbanTerresPropLossModel">
                <OBJECT Class = "UrbanTerrestrialPropagationLossModel" Name = "Two_Ray">
                    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "LossFactor"> 1 &quot;&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "double" Name = "SurfaceTemperature"> 273.15 K </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;Two Ray&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "bool" Name = "UseAtmosAbsorptionModel"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseCloudFogModel"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseCustomA"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseCustomB"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseCustomC"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseRainModel"> False </OBJECT>
            <OBJECT Class = "string" Name = "UserComment"> &quot;RF Propagation Channel&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "UseTropoScintModel"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseUrbanTerresPropLossModel"> False </OBJECT>
            <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
        </OBJECT>
    </OBJECT>
    <OBJECT Class = "double" Name = "RainOutagePercent"> 0.1 &quot;&quot; </OBJECT>
    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
    <OBJECT Class = "string" Name = "Type"> &quot;STK RF Environment&quot; </OBJECT>
    <OBJECT Class = "string" Name = "UserComment"> &quot;STK RF Environment&quot; </OBJECT>
    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
</OBJECT>
</STKOBJECT>
    END RfEnv
    
    BEGIN CommRad
    END CommRad
    
    BEGIN RCS
	Inherited          False
	LinearClutterCoef        0.000000e+000
	BEGIN RCSBAND
		LinearConstantValue      1.000000e+000
		Swerling      0
		BandData      2.997920e+006 3.000000e+011
	END RCSBAND
    END RCS
    
    BEGIN Gator
    END Gator
    
    BEGIN Crdn
    END Crdn
    
    BEGIN SpiceExt
    END SpiceExt
    
    BEGIN FlightScenExt
    END FlightScenExt
    
    BEGIN VO
    END VO

END Extensions

BEGIN SubObjects

Class Aircraft

	B747LAX_Heathrow
	B747LAX_Narita
	B747LAX_Sydney

END Class

Class Chain

	Chain3

END Class

Class Facility

	airport_aukland
	airport_beijing
	airport_Bris
	airport_chicago1
	airport_dubai
	airport_HK
	airport_JFK
	airport_Manila
	airport_Melb
	airport_sanFran
	airport_shanghai
	airport_SYD
	airport_tokyo1
	ATL
	Frankfurt
	Heathrow
	JFK
	LAX
	Paris
	Seattle
	SLO

END Class

Class Satellite

	400km_p1_1
	400km_p1_2
	400km_p1_3
	400km_p1_4
	400km_p2_1
	400km_p2_2
	400km_p2_3
	400km_p2_4
	400km_p3_1
	400km_p3_2
	400km_p3_3
	400km_p3_4

END Class

END SubObjects

BEGIN References
    Instance *
        *
        Chain/Chain3
    END Instance
    Instance Aircraft/B747LAX_Heathrow
        Aircraft/B747LAX_Heathrow
        Chain/Chain3
    END Instance
    Instance Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
        Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
        Chain/Chain3
    END Instance
    Instance Aircraft/B747LAX_Narita
        Aircraft/B747LAX_Narita
    END Instance
    Instance Aircraft/B747LAX_Narita/Transmitter/adsb_out6211
        Aircraft/B747LAX_Narita/Transmitter/adsb_out6211
    END Instance
    Instance Aircraft/B747LAX_Sydney
        Aircraft/B747LAX_Sydney
    END Instance
    Instance Aircraft/B747LAX_Sydney/Transmitter/adsb_out6212
        Aircraft/B747LAX_Sydney/Transmitter/adsb_out6212
    END Instance
    Instance Chain/Chain3
        Chain/Chain3
    END Instance
    Instance Facility/ATL
        Facility/ATL
    END Instance
    Instance Facility/ATL/Receiver/ADSB_GndRcvr1111
        Facility/ATL/Receiver/ADSB_GndRcvr1111
    END Instance
    Instance Facility/ATL/Receiver/Receiver31
        Facility/ATL/Receiver/Receiver31
    END Instance
    Instance Facility/Frankfurt
        Facility/Frankfurt
    END Instance
    Instance Facility/Frankfurt/Receiver/ADSB_GndRcvr12
        Facility/Frankfurt/Receiver/ADSB_GndRcvr12
    END Instance
    Instance Facility/Frankfurt/Receiver/Receiver32
        Facility/Frankfurt/Receiver/Receiver32
    END Instance
    Instance Facility/Heathrow
        Chain/Chain3
        Facility/Heathrow
    END Instance
    Instance Facility/Heathrow/Receiver/ADSB_GndRcvr11
        Chain/Chain3
        Facility/Heathrow/Receiver/ADSB_GndRcvr11
    END Instance
    Instance Facility/Heathrow/Receiver/Receiver3
        Facility/Heathrow/Receiver/Receiver3
    END Instance
    Instance Facility/JFK
        Facility/JFK
    END Instance
    Instance Facility/JFK/Receiver/ADSB_GndRcvr
        Facility/JFK/Receiver/ADSB_GndRcvr
    END Instance
    Instance Facility/JFK/Receiver/Receiver33
        Facility/JFK/Receiver/Receiver33
    END Instance
    Instance Facility/LAX
        Facility/LAX
    END Instance
    Instance Facility/LAX/Receiver/ADSB_GndRcvr111
        Facility/LAX/Receiver/ADSB_GndRcvr111
    END Instance
    Instance Facility/LAX/Receiver/Receiver34
        Facility/LAX/Receiver/Receiver34
    END Instance
    Instance Facility/Paris
        Facility/Paris
    END Instance
    Instance Facility/Paris/Receiver/ADSB_GndRcvr111111
        Facility/Paris/Receiver/ADSB_GndRcvr111111
    END Instance
    Instance Facility/Paris/Receiver/Receiver35
        Facility/Paris/Receiver/Receiver35
    END Instance
    Instance Facility/SLO
        Facility/SLO
    END Instance
    Instance Facility/SLO/Receiver/ADSB_GndRcvr2
        Facility/SLO/Receiver/ADSB_GndRcvr2
    END Instance
    Instance Facility/SLO/Receiver/Receiver36
        Facility/SLO/Receiver/Receiver36
    END Instance
    Instance Facility/Seattle
        Facility/Seattle
    END Instance
    Instance Facility/Seattle/Receiver/ADSB_GndRcvr11111
        Facility/Seattle/Receiver/ADSB_GndRcvr11111
    END Instance
    Instance Facility/Seattle/Receiver/Receiver37
        Facility/Seattle/Receiver/Receiver37
    END Instance
    Instance Facility/airport_Bris
        Facility/airport_Bris
    END Instance
    Instance Facility/airport_Bris/Receiver/ADSB_GndRcvr21611
        Facility/airport_Bris/Receiver/ADSB_GndRcvr21611
    END Instance
    Instance Facility/airport_Bris/Receiver/Receiver38
        Facility/airport_Bris/Receiver/Receiver38
    END Instance
    Instance Facility/airport_HK
        Facility/airport_HK
    END Instance
    Instance Facility/airport_HK/Receiver/ADSB_GndRcvr21
        Facility/airport_HK/Receiver/ADSB_GndRcvr21
    END Instance
    Instance Facility/airport_HK/Receiver/Receiver39
        Facility/airport_HK/Receiver/Receiver39
    END Instance
    Instance Facility/airport_JFK
        Facility/airport_JFK
    END Instance
    Instance Facility/airport_JFK/Receiver/ADSB_GndRcvr212
        Facility/airport_JFK/Receiver/ADSB_GndRcvr212
    END Instance
    Instance Facility/airport_JFK/Receiver/Receiver310
        Facility/airport_JFK/Receiver/Receiver310
    END Instance
    Instance Facility/airport_Manila
        Facility/airport_Manila
    END Instance
    Instance Facility/airport_Manila/Receiver/ADSB_GndRcvr21613
        Facility/airport_Manila/Receiver/ADSB_GndRcvr21613
    END Instance
    Instance Facility/airport_Manila/Receiver/Receiver311
        Facility/airport_Manila/Receiver/Receiver311
    END Instance
    Instance Facility/airport_Melb
        Facility/airport_Melb
    END Instance
    Instance Facility/airport_Melb/Receiver/ADSB_GndRcvr21612
        Facility/airport_Melb/Receiver/ADSB_GndRcvr21612
    END Instance
    Instance Facility/airport_Melb/Receiver/Receiver312
        Facility/airport_Melb/Receiver/Receiver312
    END Instance
    Instance Facility/airport_SYD
        Facility/airport_SYD
    END Instance
    Instance Facility/airport_SYD/Receiver/ADSB_GndRcvr2161
        Facility/airport_SYD/Receiver/ADSB_GndRcvr2161
    END Instance
    Instance Facility/airport_SYD/Receiver/Receiver313
        Facility/airport_SYD/Receiver/Receiver313
    END Instance
    Instance Facility/airport_aukland
        Facility/airport_aukland
    END Instance
    Instance Facility/airport_aukland/Receiver/ADSB_GndRcvr1
        Facility/airport_aukland/Receiver/ADSB_GndRcvr1
    END Instance
    Instance Facility/airport_aukland/Receiver/Receiver314
        Facility/airport_aukland/Receiver/Receiver314
    END Instance
    Instance Facility/airport_beijing
        Facility/airport_beijing
    END Instance
    Instance Facility/airport_beijing/Receiver/ADSB_GndRcvr13
        Facility/airport_beijing/Receiver/ADSB_GndRcvr13
    END Instance
    Instance Facility/airport_beijing/Receiver/Receiver315
        Facility/airport_beijing/Receiver/Receiver315
    END Instance
    Instance Facility/airport_chicago1
        Facility/airport_chicago1
    END Instance
    Instance Facility/airport_chicago1/Receiver/ADSB_GndRcvr211
        Facility/airport_chicago1/Receiver/ADSB_GndRcvr211
    END Instance
    Instance Facility/airport_chicago1/Receiver/Receiver317
        Facility/airport_chicago1/Receiver/Receiver317
    END Instance
    Instance Facility/airport_dubai
        Facility/airport_dubai
    END Instance
    Instance Facility/airport_dubai/Receiver/ADSB_GndRcvr213
        Facility/airport_dubai/Receiver/ADSB_GndRcvr213
    END Instance
    Instance Facility/airport_dubai/Receiver/Receiver318
        Facility/airport_dubai/Receiver/Receiver318
    END Instance
    Instance Facility/airport_sanFran
        Facility/airport_sanFran
    END Instance
    Instance Facility/airport_sanFran/Receiver/ADSB_GndRcvr214
        Facility/airport_sanFran/Receiver/ADSB_GndRcvr214
    END Instance
    Instance Facility/airport_sanFran/Receiver/Receiver319
        Facility/airport_sanFran/Receiver/Receiver319
    END Instance
    Instance Facility/airport_shanghai
        Facility/airport_shanghai
    END Instance
    Instance Facility/airport_shanghai/Receiver/ADSB_GndRcvr215
        Facility/airport_shanghai/Receiver/ADSB_GndRcvr215
    END Instance
    Instance Facility/airport_shanghai/Receiver/Receiver320
        Facility/airport_shanghai/Receiver/Receiver320
    END Instance
    Instance Facility/airport_tokyo1
        Facility/airport_tokyo1
    END Instance
    Instance Facility/airport_tokyo1/Receiver/ADSB_GndRcvr216
        Facility/airport_tokyo1/Receiver/ADSB_GndRcvr216
    END Instance
    Instance Facility/airport_tokyo1/Receiver/Receiver321
        Facility/airport_tokyo1/Receiver/Receiver321
    END Instance
    Instance Satellite/400km_p1_1
        Chain/Chain3
        Satellite/400km_p1_1
    END Instance
    Instance Satellite/400km_p1_1/Receiver/adsb_satrcvr2
        Chain/Chain3
        Satellite/400km_p1_1/Receiver/adsb_satrcvr2
    END Instance
    Instance Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_5W5
        Chain/Chain3
        Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_5W5_retrans
        Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_5W5_retrans
    END Instance
    Instance Satellite/400km_p1_2
        Satellite/400km_p1_2
    END Instance
    Instance Satellite/400km_p1_2/Receiver/ADSB_sat_rx
        Satellite/400km_p1_2/Receiver/ADSB_sat_rx
    END Instance
    Instance Satellite/400km_p1_2/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p1_2/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p1_2/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p1_2/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p1_3
        Satellite/400km_p1_3
    END Instance
    Instance Satellite/400km_p1_3/Receiver/ADSB_sat_rx1
        Satellite/400km_p1_3/Receiver/ADSB_sat_rx1
    END Instance
    Instance Satellite/400km_p1_3/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p1_3/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p1_3/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p1_3/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p1_4
        Satellite/400km_p1_4
    END Instance
    Instance Satellite/400km_p1_4/Receiver/ADSB_sat_rx2
        Satellite/400km_p1_4/Receiver/ADSB_sat_rx2
    END Instance
    Instance Satellite/400km_p1_4/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p1_4/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p1_4/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p1_4/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p2_1
        Satellite/400km_p2_1
    END Instance
    Instance Satellite/400km_p2_1/Receiver/ADSB_sat_rx3
        Satellite/400km_p2_1/Receiver/ADSB_sat_rx3
    END Instance
    Instance Satellite/400km_p2_1/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p2_1/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p2_1/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p2_1/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p2_2
        Satellite/400km_p2_2
    END Instance
    Instance Satellite/400km_p2_2/Receiver/ADSB_sat_rx4
        Satellite/400km_p2_2/Receiver/ADSB_sat_rx4
    END Instance
    Instance Satellite/400km_p2_2/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p2_2/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p2_2/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p2_2/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p2_3
        Satellite/400km_p2_3
    END Instance
    Instance Satellite/400km_p2_3/Receiver/ADSB_sat_rx5
        Satellite/400km_p2_3/Receiver/ADSB_sat_rx5
    END Instance
    Instance Satellite/400km_p2_3/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p2_3/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p2_3/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p2_3/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p2_4
        Satellite/400km_p2_4
    END Instance
    Instance Satellite/400km_p2_4/Receiver/ADSB_sat_rx6
        Satellite/400km_p2_4/Receiver/ADSB_sat_rx6
    END Instance
    Instance Satellite/400km_p2_4/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p2_4/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p2_4/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p2_4/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p3_1
        Satellite/400km_p3_1
    END Instance
    Instance Satellite/400km_p3_1/Receiver/ADSB_sat_rx7
        Satellite/400km_p3_1/Receiver/ADSB_sat_rx7
    END Instance
    Instance Satellite/400km_p3_1/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p3_1/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p3_1/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p3_1/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p3_2
        Satellite/400km_p3_2
    END Instance
    Instance Satellite/400km_p3_2/Receiver/ADSB_sat_rx8
        Satellite/400km_p3_2/Receiver/ADSB_sat_rx8
    END Instance
    Instance Satellite/400km_p3_2/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p3_2/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p3_2/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p3_2/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p3_3
        Satellite/400km_p3_3
    END Instance
    Instance Satellite/400km_p3_3/Receiver/ADSB_sat_rx9
        Satellite/400km_p3_3/Receiver/ADSB_sat_rx9
    END Instance
    Instance Satellite/400km_p3_3/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p3_3/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p3_3/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p3_3/Transmitter/Cubesat_ADSB_5W5
    END Instance
    Instance Satellite/400km_p3_4
        Satellite/400km_p3_4
    END Instance
    Instance Satellite/400km_p3_4/Receiver/ADSB_sat_rx10
        Satellite/400km_p3_4/Receiver/ADSB_sat_rx10
    END Instance
    Instance Satellite/400km_p3_4/Transmitter/Cubesat_ADSB_2W
        Satellite/400km_p3_4/Transmitter/Cubesat_ADSB_2W
    END Instance
    Instance Satellite/400km_p3_4/Transmitter/Cubesat_ADSB_5W5
        Satellite/400km_p3_4/Transmitter/Cubesat_ADSB_5W5
    END Instance
END References

END Scenario
